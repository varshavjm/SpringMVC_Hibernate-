package com.demo.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.mvc.entities.Order;
import com.demo.mvc.services.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;


	@GetMapping("/listAll")
	public String listAll(Model model) {
		System.out.println("Entered listAll");
		model.addAttribute("order", orderService.getAllOrders());
		return "list-orders";
		
	}
	
	@GetMapping("/viewOrder")
	public String viewOrder(@RequestParam("orderId") int orderId,Model model) {
		System.out.println("Entered viewOrder");
		Order order=orderService.getOrder(orderId);
		model.addAttribute("order", order);
		return "orderform";
	}
	
	@GetMapping("/newOrder")
	public String newOrder(Model model) {
		model.addAttribute("order",new Order());
		return "orderform";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("order") Order order) {
		System.out.println("Save called");
		System.out.println(order.toString());
		orderService.saveOrder(order);
		return "redirect:/order/listAll";
		
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("orderId") int orderId,Model model) {
		System.out.println("The id to be deleted is "+orderId);
		orderService.deleteOrder(orderId);
		return "redirect:/order/listAll";
		
	}

}
