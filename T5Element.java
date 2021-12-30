class T5Element {

	private int lB;
	private int uB;

	int getLB () { return lB; }
	void setLB (int lB) { this.lB = lB; }

	int getUB () { return uB; }
	void setUB (int uB) { this.uB = uB; }

	int T5getElement(int num) throws T5Exception {
		if (num <= lB | num >= uB) throw new T5Exception("The number is out of range", num);
		return num;
	}

}