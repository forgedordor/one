package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import org.whispersystems.curve25519.Curve25519;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oke {
    private static final ThreadLocal a = new ThreadLocal();
    private final Context b;
    private final ola c;

    public oke(Context context, ola olaVar) {
        olaVar.getClass();
        this.b = context;
        this.c = olaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0282, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ojx b(android.content.res.Resources r19, android.content.res.XmlResourceParser r20, android.util.AttributeSet r21, int r22) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):ojx");
    }

    private static final oil c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException, Resources.NotFoundException {
        okq okqVarA;
        Object objC;
        okq okqVar;
        int[] iArr = oli.a;
        boolean z = false;
        boolean z2 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        if (string != null) {
            okq okqVar2 = okq.a;
            String resourcePackageName = resources.getResourcePackageName(i);
            if (string.startsWith(Curve25519.JAVA)) {
                try {
                    okqVarA = okk.a("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e) {
                    if (!(e.getCause() instanceof ClassNotFoundException)) {
                        throw e;
                    }
                }
            } else {
                okqVarA = okk.a(string, resourcePackageName);
            }
        } else {
            okqVarA = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            okq okqVar3 = okq.b;
            if (okqVarA == okqVar3) {
                if (typedValue.resourceId != 0) {
                    objC = Integer.valueOf(typedValue.resourceId);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + okqVarA.e() + ". Must be a reference to a resource.");
                    }
                    objC = 0;
                }
            } else if (typedValue.resourceId != 0) {
                if (okqVarA != null) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + okqVarA.e() + ". You must use a \"reference\" type to reference other resources.");
                }
                objC = Integer.valueOf(typedValue.resourceId);
                okqVarA = okqVar3;
            } else if (okqVarA == okq.n) {
                objC = typedArray.getString(1);
            } else {
                int i2 = typedValue.type;
                if (i2 == 3) {
                    String string2 = typedValue.string.toString();
                    if (okqVarA == null) {
                        string2.getClass();
                        try {
                            try {
                                try {
                                    try {
                                        okqVar = okq.a;
                                        okqVar.c(string2);
                                    } catch (IllegalArgumentException unused) {
                                        okqVar = okq.h;
                                        okqVar.c(string2);
                                    }
                                } catch (IllegalArgumentException unused2) {
                                    okqVar = okq.e;
                                    okqVar.c(string2);
                                }
                            } catch (IllegalArgumentException unused3) {
                                okqVar = okq.n;
                            }
                        } catch (IllegalArgumentException unused4) {
                            okqVar = okq.k;
                            okqVar.c(string2);
                        }
                        okqVarA = okqVar;
                    }
                    objC = okqVarA.c(string2);
                } else if (i2 == 4) {
                    okqVarA = okd.a(typedValue, okqVarA, okq.h, string, "float");
                    objC = Float.valueOf(typedValue.getFloat());
                } else if (i2 == 5) {
                    okqVarA = okd.a(typedValue, okqVarA, okq.a, string, "dimension");
                    objC = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                } else if (i2 == 18) {
                    okqVarA = okd.a(typedValue, okqVarA, okq.k, string, "boolean");
                    objC = Boolean.valueOf(typedValue.data != 0);
                } else {
                    if (typedValue.type < 16 || typedValue.type > 31) {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    }
                    okq okqVar4 = okq.h;
                    if (okqVarA == okqVar4) {
                        okqVarA = okd.a(typedValue, okqVarA, okqVar4, string, "float");
                        objC = Float.valueOf(typedValue.data);
                    } else {
                        okqVarA = okd.a(typedValue, okqVarA, okq.a, string, "integer");
                        objC = Integer.valueOf(typedValue.data);
                    }
                }
            }
        } else {
            objC = null;
        }
        if (objC != null) {
            z = true;
        } else {
            objC = null;
        }
        okq okqVar5 = okqVarA != null ? okqVarA : null;
        if (okqVar5 == null) {
            okq okqVar6 = okq.a;
            if (objC instanceof Integer) {
                okqVar5 = okq.a;
            } else if (objC instanceof int[]) {
                okqVar5 = okq.c;
            } else if (objC instanceof Long) {
                okqVar5 = okq.e;
            } else if (objC instanceof long[]) {
                okqVar5 = okq.f;
            } else if (objC instanceof Float) {
                okqVar5 = okq.h;
            } else if (objC instanceof float[]) {
                okqVar5 = okq.i;
            } else if (objC instanceof Boolean) {
                okqVar5 = okq.k;
            } else if (objC instanceof boolean[]) {
                okqVar5 = okq.l;
            } else {
                boolean z3 = objC instanceof String;
                okqVar5 = okq.n;
            }
        }
        return new oil(okqVar5, z2, objC, z);
    }

    public final oka a(int i) {
        int next;
        Resources resources = this.b.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        resources.getClass();
                        attributeSetAsAttributeSet.getClass();
                        ojx ojxVarB = b(resources, xml, attributeSetAsAttributeSet, i);
                        if (ojxVarB instanceof oka) {
                            return (oka) ojxVarB;
                        }
                        throw new IllegalArgumentException(a.a(name, "Root element <", "> did not inflate into a NavGraph"));
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
