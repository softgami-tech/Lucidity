# Lucidity
Best route problem 

Problem statement : the shortest time to deliver orders to the customer.

Solution :
Possible paths:
There can be multiple path. Here order is preserved. Because C1 has ordered from R1 and C2 has ordered from R2.
Aman->R1->C1->R2->C2
Aman->R1->R2->C2->C1
Aman->R1->R2->C1->C2
Aman->R2->R1->C1->C2
Aman->R2->R1->C2->C1

Basically, there will be certain constraint on each node that Aman will not be able move freely from any node any node.For example Aman picks prder from R1 so it should not go first to C2. or Aman pickes order from R2 so it should not go to C1 directly. so traversal from one node to anothe node depends on follwoing point :
1. a source node can go to those nodes only whose pointer is hold by the source node
2. from any node , Aman can move only to two nodes.
3. the shortest path should be picked by Aman based on haversign formula which will give distance between any two node for which Aman is allowed to traverse.
4. Thers is consideration that always there is source node from where traversal starts.

By the end of the day , upon all traversal Aman will end up delivered his orders in shortest path.
