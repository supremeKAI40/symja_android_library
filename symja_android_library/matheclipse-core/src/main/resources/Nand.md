## Nand

```
Nand(arg1, arg2, ...)'
```

> Logical NAND function. It evaluates its arguments in order, giving `True` immediately if any of them are `False`, and `False` if they are all `True`.

See 
* [Wikipedia - Sheffer stroke](https://en.wikipedia.org/wiki/Sheffer_stroke)
 
### Examples

```
>> Nand(True, True, True)
False
 
>> Nand(True, False, a)
True
```