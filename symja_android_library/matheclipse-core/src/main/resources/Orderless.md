## Orderless

```
Orderless
```

> is an attribute indicating that the leaves in an expression `f(a, b, c)` can be placed in any order.    

See  
* [Wikipedia - Commutative property](https://en.wikipedia.org/wiki/Commutative_property)
* [Wikipedia - Order theory](https://en.wikipedia.org/wiki/Order_theory)

### Examples

The leaves of an `Orderless` function are automatically sorted:

```    
>> SetAttributes(f, Orderless)    
>> f(c, a, b, a + b, 3, 1.0)    
f(1.0,3,a,b,a+b,c) 
```

A symbol with the `Orderless` attribute represents a commutative mathematical operation.
  
```
>> f(a, b) == f(b, a)    
True    
```

`Orderless` affects pattern matching:

```
>> SetAttributes(f, Flat) 
>> f(a, b, c) /. f(a, c) -> d    
f(b, d)    
```

### Related terms 
[Constant](Constant.md),  [Flat](Flat.md), [HoldAll](HoldAll.md), [HoldFirst](HoldFirst.md), [HoldRest](HoldRest.md), [Listable](Listable.md), [NHoldAll](NHoldAll.md), [NHoldFirst](NHoldFirst.md), [NHoldRest](NHoldRest.md)