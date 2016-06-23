case class Sizes(caller: Int, perms: Int)
case class Perms(permutations: Array[Array[Int]])
case class SuperSized(size: Sizes, perm: Perms)

def customCopy(i:Iterator[Array[Int]]): Array[Array[Int]] = {
	
	val callerSize = i.size
	val _r         = Array.fill[Int](callerSize)(0)
	val _ret       = Array.ofDim[Int](permsSize, callerSize)
	
	for ((_r, idx) <- perms.zipWithIndex) { _ret(idx) = _r(idx)
	} 
	
	_ret
	
}

def sizeMeUp(r: Array[Int]):SuperSized = { 

	val itr = r.permutations
	val siz = r.permutations.size
	val __r  = Array.fill[Any](siz)(0)
	val _perms = customCopy(__r)
	SuperSized( Sizes(__r.size, siz), Perms(_perms) )
	
}


// test
val r = (1 to 5).toArray
val d = sizeMeUp(r)

// should print 5
d.size.caller

// should print 120
d.size.perms

// should say Array[Array[Int]] = Array()
d.perm.permutations

// NOT working ==> 
// should say 120 i may need to iterate over for real
d.perm.permutations.size

