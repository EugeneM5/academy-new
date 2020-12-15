package by.academy.classwork.lesson11;

class HeavyBox extends Box {
    int weight; 
    
    HeavyBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m; 
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append(", getVolume()=");
		builder.append(getVolume());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
    
}
