package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebzn implements ebzu {
    private final String a;
    private final Object b;
    private final Method c;
    private ebzm d;

    public ebzn(String str, Object obj, Method method) {
        this.a = str;
        this.b = obj;
        this.c = method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private final synchronized ebzm e() {
        if (this.d == null) {
            Method method = this.c;
            ebzm ebzmVar = new ebzm(method);
            this.d = ebzmVar;
            try {
                if (!ebzmVar.d) {
                    ?? r2 = ebzmVar.c;
                    while (true) {
                        Class[] clsArr = ebzmVar.b;
                        if (r2 >= clsArr.length) {
                            break;
                        }
                        Class cls = clsArr[r2];
                        if (!ebzm.a.contains(cls) && !cls.isEnum()) {
                            throw new IllegalArgumentException("Invalid param: ".concat(String.valueOf(cls.getSimpleName())));
                        }
                        r2 += 2;
                    }
                } else {
                    if (ebzmVar.b.length != (ebzmVar.c ? 1 : 0) + 1) {
                        throw new IllegalArgumentException("Extra params not allowed after String[]");
                    }
                }
                method.setAccessible(true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid method signature: ".concat(String.valueOf(String.valueOf(this.c))), e);
            }
        }
        return this.d;
    }

    private final String f(Object obj) {
        if (obj == null && this.c.getReturnType() == Void.TYPE) {
            return "OK";
        }
        if (!(obj instanceof Future)) {
            return String.valueOf(obj);
        }
        try {
            return String.valueOf(((Future) obj).get());
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Short] */
    public final String a(ebzm ebzmVar, Context context, String[] strArr) throws NumberFormatException {
        int i;
        try {
            if (ebzmVar.d) {
                return ebzmVar.c ? f(this.c.invoke(this.b, context, strArr)) : f(this.c.invoke(this.b, strArr));
            }
            int length = strArr.length;
            boolean z = ebzmVar.c;
            ?? r4 = new Object[z ? length + 1 : length];
            if (z) {
                r4[0] = context;
                i = 1;
            } else {
                i = 0;
            }
            for (?? ValueOf : strArr) {
                Class cls = ebzmVar.b[i];
                if (cls != String.class) {
                    if (cls == Byte.TYPE) {
                        ValueOf = Byte.valueOf((String) ValueOf);
                    } else if (cls == Short.TYPE) {
                        ValueOf = Short.valueOf((String) ValueOf);
                    } else if (cls == Integer.TYPE) {
                        ValueOf = Integer.valueOf((String) ValueOf);
                    } else if (cls == Long.TYPE) {
                        ValueOf = Long.valueOf((String) ValueOf);
                    } else if (cls == Float.TYPE) {
                        ValueOf = Float.valueOf((String) ValueOf);
                    } else if (cls == Double.TYPE) {
                        ValueOf = Double.valueOf((String) ValueOf);
                    } else if (cls == Boolean.TYPE) {
                        ValueOf = Boolean.valueOf((String) ValueOf);
                    } else {
                        if (cls != Character.TYPE) {
                            if (!cls.isEnum()) {
                                throw new IllegalArgumentException("Invalid param type: ".concat(String.valueOf(String.valueOf(cls))));
                            }
                            for (Enum r9 : (Enum[]) cls.getEnumConstants()) {
                                if (r9.name().equals(ValueOf)) {
                                    ValueOf = r9;
                                }
                            }
                            throw new IllegalArgumentException("Invalid enum value: ".concat(String.valueOf((Object) ValueOf)));
                        }
                        if (ValueOf.length() != 1) {
                            throw new IllegalArgumentException("Invalid char param: ".concat(String.valueOf((Object) ValueOf)));
                        }
                        ValueOf = Character.valueOf(ValueOf.charAt(0));
                    }
                }
                r4[i] = ValueOf;
                i++;
            }
            return f(this.c.invoke(this.b, r4));
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            String string = e.toString();
            StringBuilder sb = new StringBuilder("Usage: ");
            sb.append(this.a);
            ebzm ebzmVarE = e();
            if (!ebzmVarE.d) {
                ?? r0 = ebzmVarE.c;
                while (true) {
                    Class[] clsArr = ebzmVarE.b;
                    if (r0 >= clsArr.length) {
                        break;
                    }
                    sb.append(" <");
                    sb.append(clsArr[r0].getSimpleName());
                    sb.append('>');
                    r0++;
                }
            } else {
                sb.append(" [params...]");
            }
            sb.append('\n');
            return a.q(sb.toString(), string, "\n\n");
        }
    }

    @Override // defpackage.ebzu
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ebzu
    public final String c(Context context, String[] strArr) {
        ebzm ebzmVarE = e();
        return ebzmVarE.e ? new ebzl(this, ebzmVarE).c(context, strArr) : a(ebzmVarE, context, strArr);
    }

    @Override // defpackage.ebzu
    public final String[] d(Context context, String[] strArr) {
        ebzm ebzmVarE = e();
        if (!ebzmVarE.d) {
            boolean z = ebzmVarE.c;
            Class[] clsArr = ebzmVarE.b;
            int length = clsArr.length - (z ? 1 : 0);
            int length2 = strArr.length;
            if (length2 < length) {
                Class cls = clsArr[(z ? 1 : 0) + length2];
                if (cls == Boolean.TYPE) {
                    return new String[]{"true", "false"};
                }
                if (cls.isEnum()) {
                    Enum[] enumArr = (Enum[]) cls.getEnumConstants();
                    int length3 = enumArr.length;
                    String[] strArr2 = new String[length3];
                    for (int i = 0; i < length3; i++) {
                        strArr2[i] = enumArr[i].name();
                    }
                    return strArr2;
                }
            }
        }
        return new String[0];
    }
}
