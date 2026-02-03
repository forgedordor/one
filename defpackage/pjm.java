package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjm {
    public static final void a(pju pjuVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    pjuVar.f(i);
                } else if (obj instanceof byte[]) {
                    pjuVar.c(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    pjuVar.d(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    pjuVar.d(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    pjuVar.e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    pjuVar.e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    pjuVar.e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    pjuVar.e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    pjuVar.g(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    pjuVar.e(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }
}
