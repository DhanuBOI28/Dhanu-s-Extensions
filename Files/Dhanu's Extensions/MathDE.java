//*
* Author: Dhanu_
* Version: 1.0
*/
public class MathDE {
  // The infamous ''3.14159265358979...'' value (RO).
  public static final float PI = (float) Math.PI;

  // A representation of positive infinity (RO).
  public static final float INFINITY = Float.POSITIVE_INFINITY;

  // A representation of negative infinity (RO).
  public static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;

  // Degrees-to-radians conversion constant (RO).
  public static final float DEG_2_RAD = PI * 2F / 360F;

  // Radians-to-degrees conversion constant (RO).
  public static final float RAD_2_DEG = 1F / DEG_2_RAD;

  public float epsilon = getEpsilon();

  public static float sin(float angle) {
    return (float) Math.sin(angle);
  }

  // Returns the cosine of angle in radians.
  public static float cos(float angle) {
    return (float) Math.cos(angle);
  }

  // Returns the tangent of angle in radians.
  public static float tan(float angle) {
    return (float) Math.tan(angle);
  }

  // Returns the arc-sine of value - the angle in radians whose sine is value.
  public static float asin(float value) {
    return (float) Math.asin(value);
  }

  // Returns the arc-cosine of value - the angle in radians whose cosine is value.
  public static float acos(float value) {
    return (float) Math.acos(value);
  }

  // Returns the arc-tangent of value - the angle in radians whose tangent is value.
  public static float atan(float value) {
    return (float) Math.atan(value);
  }

  // Returns the angle in radians whose tangent is y/x.
  public static float atan2(float y, float x) {
    return (float) Math.atan2(y, x);
  }

  // Returns square root of value.
  public static float sqrt(float value) {
    return (float) Math.sqrt(value);
  }

  // Returns the absolute value of value.
  public static float abs(float value) {
    return Math.abs(value);
  }

  public static float min(float a, float b) {
    return a < b ? a : b;
  }

  public static float min(float[] values) {
    int len = values.length;
    if (len == 0) return 0;
    float minValue = values[0];
    for (int i = 1; i < len; i++) {
      if (values[i] < minValue) minValue = values[i];
    }
    return minValue;
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }

  // Returns the smallest of two or more values.
  public static int min(int[] values) {
    int len = values.length;
    if (len == 0) return 0;
    int minValue = values[0];
    for (int i = 1; i < len; i++) {
      if (values[i] < minValue) minValue = values[i];
    }
    return minValue;
  }

  public static float max(float a, float b) {
    return a > b ? a : b;
  }

  // Returns largest of two or more values.
  public static float max(float[] values) {
    int len = values.length;
    if (len == 0) return 0;
    float maxValue = values[0];
    for (int i = 1; i < len; i++) {
      if (values[i] > maxValue) maxValue = values[i];
    }
    return maxValue;
  }

  public static int max(int a, int b) {
    return a > b ? a : b;
  }

  // Returns the largest of two or more values.
  public static int max(int[] values) {
    int len = values.length;
    if (len == 0) return 0;
    int maxValue = values[0];
    for (int i = 1; i < len; i++) {
      if (values[i] > maxValue) maxValue = values[i];
    }
    return maxValue;
  }

  // Returns value raised to power power.
  public static float pow(float value, float power) {
    return (float) Math.pow(value, power);
  }

  // Returns e raised to the specified power.
  public static float exp(float power) {
    return (float) Math.exp(power);
  }

  // Returns the logarithm of a specified number in a specified base.
  public static float log(float value, float base) {
    return (float) Math.log(value) / Math.log(base);
  }

  // Returns the natural (base e) logarithm of a specified number.
  public static float log(float value) {
    return (float) Math.log(value);
  }

  // Returns the base 10 logarithm of a specified number.
  public static float log10(float value) {
    return (float) Math.log10(value);
  }

  // Returns the smallest integer greater to or equal to value.
  public static float ceil(float value) {
    return (float) Math.ceil(value);
  }

  // Returns the largest integer smaller to or equal to value.
  public static float floor(float value) {
    return (float) Math.floor(value);
  }

  // Returns value rounded to the nearest integer.
  public static float round(float value) {
    return (float) Math.round(value);
  }

  // Returns the smallest integer greater to or equal to value.
  public static int ceilToInt(float value) {
    return (int) Math.ceil(value);
  }

  // Returns the largest integer smaller to or equal to value.
  public static int floorToInt(float value) {
    return (int) Math.floor(value);
  }

  // Returns value rounded to the nearest integer.
  public static int roundToInt(float value) {
    return (int) Math.round(value);
  }

  // Returns the sign of value.
  public static float sign(float value) {
    return value >= 0F ? 1F : -1F;
  }

  // Clamps a value between a minimum float and maximum float value.
  public static float clamp(float value, float min, float max) {
    if (value < min) value = min;
    else if (value > max) value = max;
    return value;
  }

  // Clamps value between min and max and returns value.
  public static int clamp(int value, int min, int max) {
    if (value < min) value = min;
    else if (value > max) value = max;
    return value;
  }

  // Clamps value between 0 and 1 and returns value.
  public static float clamp01(float value) {
    if (value < 0F) return 0F;
    else if (value > 1F) return 1F;
    else return value;
  }

  public static float getEpsilon() {
    float floatEpsilon = 1.0f;
    while (1.0f + floatEpsilon / 2.0f != 1.0f) {
      floatEpsilon /= 2.0f;
    }
    return floatEpsilon;
  }

  // Interpolates between a and b by t. t is clamped between 0 and 1.
  public static float lerp(float a, float b, float t) {
    return a + (b - a) * clamp01(t);
  }

  // Interpolates between a and b by t without clamping the interpolant.
  public static float lerpUnclamped(float a, float b, float t) {
    return a + (b - a) * t;
  }

  // Same as lerp but makes sure the values interpolate correctly when they wrap around 360 degrees.
  public static float lerpAngle(float a, float b, float t) {
    float delta = repeat((b - a), 360);
    if (delta > 180) delta -= 360;
    return a + delta * clamp01(t);
  }

  // Moves a value current towards target.
  public static float moveTowards(float current, float target, float maxDelta) {
    if (abs(target - current) <= maxDelta) return target;
    return current + sign(target - current) * maxDelta;
  }

  // Same as moveTowards but makes sure the values interpolate correctly when they wrap around 360 degrees.
  public static float moveTowardsAngle(float current, float target, float maxDelta) {
    float deltaAngle = deltaAngle(current, target);
    if (-maxDelta < deltaAngle && deltaAngle < maxDelta) return target;
    target = current + deltaAngle;
    return moveTowards(current, target, maxDelta);
  }

  // Interpolates between min and max with smoothing at the limits.
  public static float smoothStep(float from, float to, float t) {
    t = clamp01(t);
    t = -2.0F * t * t * t + 3.0F * t * t;
    return to * t + from * (1F - t);
  }

  public static float gamma(float value, float absmax, float gamma) {
    boolean negative = value < 0F;
    float absval = abs(value);
    if (absval > absmax) return negative ? -absval : absval;

    float adjustedValue = (float) Math.pow(absval / absmax, gamma) * absmax;
    return negative ? -adjustedValue : adjustedValue;
  }

  // Loops the value t, so that it is never larger than length and never smaller than 0.
  public static float repeat(float t, float length) {
    return clamp(t - (float) Math.floor(t / length) * length, 0.0F, length);
  }

  // Ping-pongs the value t, so that it is never larger than length and never smaller than 0.
  public static float pingPong(float t, float length) {
    t = repeat(t, length * 2F);
    return length - abs(t - length);
  }

  // Calculates the shortest difference between two given angles.
  public static float deltaAngle(float current, float target) {
    float delta = repeat((target - current), 360.0F);
    if (delta > 180.0F) delta -= 360.0F;
    return delta;
  }

  // Returns the linear parameter that produces the interpolant value within the range [a, b].
  public static float inverseLerp(float a, float b, float value) {
    if (a != b) {
      return clamp01((value - a) / (b - a));
    }
    return 0.0F;
  }

  // Calculates the logarithm of a specified number in a specified base.
  public static float logBase(float value, float base) {
    return (float) (Math.log(value) / Math.log(base));
  }
  
  // Returns the modulus of a value and a divisor.
  public static float mod(float value, float divisor) {
    return ((value % divisor) + divisor) % divisor;
  }
  
}
