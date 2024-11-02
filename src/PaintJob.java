public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width < 0.1 || height < 0.1 || areaPerBucket < 0.1 || extraBuckets < 0) return -1;
        return (int) Math.ceil(((width * height) - (areaPerBucket * extraBuckets)) / areaPerBucket);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width < 0.1 || height < 0.1 || areaPerBucket < 0.1 ) return -1;
        return (int) Math.ceil((width * height) / areaPerBucket);

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area < 0.1 || areaPerBucket < 0.1) return -1;
        return (int) Math.ceil(area / areaPerBucket);
    }
}
