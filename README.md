# A4: Applied research on parcel delivery

## Objective

Determination of the route to be performed to make the delivery of a set of orders.

## Summary

A textile company has two trucks to distribute its orders in a certain region.
The trucks have a certain autonomy (fuel), and a maximum capacity of load (volume).
An order is characterized by it's volume, value, delivery point, and customer.

Having several orders scheduled for today, one of the drivers did not attend work due to illness,
so only one of the trucks will carry out the delivery of orders. The objective is to determine the
route to be performed by the truck today (and which orders to deliver) in order to optimize
different criteria, according to the user's specification: to maximize the number of deliveries,
to minimize the space traveled. The time that it takes the truck to complete the route cannot
exceed the time that the driver works today.

You must ensure that the truck never runs out of fuel (it can be fueled in its own locations
distributed on the map). Consider that on a work day, the company's driver travels, on average, 500Kms.

The map relative to the region (graph) and the different configuration parameters of the problem
must be editable. The work must be tested on instances of the problem of different, increasingly complex dimensions.
