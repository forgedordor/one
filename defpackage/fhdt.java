package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdt {
    private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final fhdy a;
    final Method b;
    final Annotation[] c;
    final Annotation[][] d;
    final Type[] e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    String n;
    boolean o;
    boolean p;
    boolean q;
    String r;
    feyn s;
    feyt t;
    Set u;
    fhdn[] v;
    boolean w;

    public fhdt(fhdy fhdyVar, Method method) {
        this.a = fhdyVar;
        this.b = method;
        this.c = method.getAnnotations();
        this.e = method.getGenericParameterTypes();
        this.d = method.getParameterAnnotations();
    }

    private static Class c(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    private final void d(int i, Type type) {
        if (fhef.o(type)) {
            throw fhef.d(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    private static /* synthetic */ String e(Class cls) {
        return cls.getSimpleName() + " must include generic type (e.g., " + cls.getSimpleName() + "<String>)";
    }

    public final fhdn a(int i, Type type, Annotation[] annotationArr, boolean z) {
        fhdn fhdnVar;
        fhdn fhdmVar;
        fhdn fhcyVar;
        fhdn fhdfVar;
        fhdn fhcxVar;
        if (annotationArr != null) {
            fhdnVar = null;
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof fhfo) {
                    d(i, type);
                    if (this.m) {
                        throw fhef.d(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                    }
                    if (this.i) {
                        throw fhef.d(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                    }
                    if (this.j) {
                        throw fhef.d(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    if (this.k) {
                        throw fhef.d(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                    }
                    if (this.l) {
                        throw fhef.d(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    if (this.r != null) {
                        throw fhef.d(this.b, i, "@Url cannot be used with @%s URL", this.n);
                    }
                    this.m = true;
                    if (type != feyq.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                        throw fhef.d(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                    }
                    fhdmVar = new fhdl(this.b, i);
                } else {
                    if (annotation instanceof fhfi) {
                        d(i, type);
                        if (this.j) {
                            throw fhef.d(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                        }
                        if (this.k) {
                            throw fhef.d(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                        }
                        if (this.l) {
                            throw fhef.d(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                        }
                        if (this.m) {
                            throw fhef.d(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        if (this.r == null) {
                            throw fhef.d(this.b, i, "@Path can only be used with relative url on @%s", this.n);
                        }
                        this.i = true;
                        fhfi fhfiVar = (fhfi) annotation;
                        String strA = fhfiVar.a();
                        if (!y.matcher(strA).matches()) {
                            throw fhef.d(this.b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), strA);
                        }
                        if (!this.u.contains(strA)) {
                            throw fhef.d(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, strA);
                        }
                        this.a.c(type);
                        fhdfVar = new fhdg(this.b, i, strA, fhfiVar.b());
                    } else if (annotation instanceof fhfj) {
                        d(i, type);
                        fhfj fhfjVar = (fhfj) annotation;
                        String strA2 = fhfjVar.a();
                        boolean zB = fhfjVar.b();
                        Class clsA = fhef.a(type);
                        this.j = true;
                        if (Iterable.class.isAssignableFrom(clsA)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fhef.d(this.b, i, e(clsA), new Object[0]);
                            }
                            this.a.c(fhef.h(0, (ParameterizedType) type));
                            fhdmVar = new fhcw(new fhdh(strA2, zB));
                        } else if (clsA.isArray()) {
                            this.a.c(c(clsA.getComponentType()));
                            fhdmVar = new fhcx(new fhdh(strA2, zB));
                        } else {
                            this.a.c(type);
                            fhcyVar = new fhdh(strA2, zB);
                            fhdmVar = fhcyVar;
                        }
                    } else if (annotation instanceof fhfl) {
                        d(i, type);
                        boolean zA = ((fhfl) annotation).a();
                        Class clsA2 = fhef.a(type);
                        this.k = true;
                        if (Iterable.class.isAssignableFrom(clsA2)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fhef.d(this.b, i, e(clsA2), new Object[0]);
                            }
                            this.a.c(fhef.h(0, (ParameterizedType) type));
                            fhcxVar = new fhcw(new fhdj(zA));
                        } else if (clsA2.isArray()) {
                            this.a.c(c(clsA2.getComponentType()));
                            fhcxVar = new fhcx(new fhdj(zA));
                        } else {
                            this.a.c(type);
                            fhdmVar = new fhdj(zA);
                        }
                        fhdmVar = fhcxVar;
                    } else if (annotation instanceof fhfk) {
                        d(i, type);
                        Class clsA3 = fhef.a(type);
                        this.l = true;
                        if (!Map.class.isAssignableFrom(clsA3)) {
                            throw fhef.d(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                        }
                        Type typeI = fhef.i(type, clsA3, Map.class);
                        if (!(typeI instanceof ParameterizedType)) {
                            throw fhef.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType = (ParameterizedType) typeI;
                        Type typeH = fhef.h(0, parameterizedType);
                        if (typeH != String.class) {
                            throw fhef.d(this.b, i, "@QueryMap keys must be of type String: ".concat(String.valueOf(String.valueOf(typeH))), new Object[0]);
                        }
                        fhdfVar = new fhdi(this.b, i, this.a.c(fhef.h(1, parameterizedType)), ((fhfk) annotation).a());
                    } else if (annotation instanceof fhey) {
                        d(i, type);
                        String strA3 = ((fhey) annotation).a();
                        Class clsA4 = fhef.a(type);
                        if (Iterable.class.isAssignableFrom(clsA4)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fhef.d(this.b, i, e(clsA4), new Object[0]);
                            }
                            this.a.c(fhef.h(0, (ParameterizedType) type));
                            fhcxVar = new fhcw(new fhdb(strA3));
                        } else if (clsA4.isArray()) {
                            this.a.c(c(clsA4.getComponentType()));
                            fhcxVar = new fhcx(new fhdb(strA3));
                        } else {
                            this.a.c(type);
                            fhdmVar = new fhdb(strA3);
                        }
                        fhdmVar = fhcxVar;
                    } else if (annotation instanceof fhez) {
                        if (type == feyn.class) {
                            fhdmVar = new fhdd(this.b, i);
                        } else {
                            d(i, type);
                            Class clsA5 = fhef.a(type);
                            if (!Map.class.isAssignableFrom(clsA5)) {
                                throw fhef.d(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                            }
                            Type typeI2 = fhef.i(type, clsA5, Map.class);
                            if (!(typeI2 instanceof ParameterizedType)) {
                                throw fhef.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                            Type typeH2 = fhef.h(0, parameterizedType2);
                            if (typeH2 != String.class) {
                                throw fhef.d(this.b, i, "@HeaderMap keys must be of type String: ".concat(String.valueOf(String.valueOf(typeH2))), new Object[0]);
                            }
                            this.a.c(fhef.h(1, parameterizedType2));
                            fhdmVar = new fhdc(this.b, i);
                        }
                    } else if (annotation instanceof fhes) {
                        d(i, type);
                        if (!this.p) {
                            throw fhef.d(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                        fhes fhesVar = (fhes) annotation;
                        String strA4 = fhesVar.a();
                        boolean zB2 = fhesVar.b();
                        this.f = true;
                        Class clsA6 = fhef.a(type);
                        if (Iterable.class.isAssignableFrom(clsA6)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fhef.d(this.b, i, e(clsA6), new Object[0]);
                            }
                            this.a.c(fhef.h(0, (ParameterizedType) type));
                            fhdmVar = new fhcw(new fhcz(strA4, zB2));
                        } else if (clsA6.isArray()) {
                            this.a.c(c(clsA6.getComponentType()));
                            fhdmVar = new fhcx(new fhcz(strA4, zB2));
                        } else {
                            this.a.c(type);
                            fhcyVar = new fhcz(strA4, zB2);
                            fhdmVar = fhcyVar;
                        }
                    } else if (annotation instanceof fhet) {
                        d(i, type);
                        if (!this.p) {
                            throw fhef.d(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                        }
                        Class clsA7 = fhef.a(type);
                        if (!Map.class.isAssignableFrom(clsA7)) {
                            throw fhef.d(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        Type typeI3 = fhef.i(type, clsA7, Map.class);
                        if (!(typeI3 instanceof ParameterizedType)) {
                            throw fhef.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                        Type typeH3 = fhef.h(0, parameterizedType3);
                        if (typeH3 != String.class) {
                            throw fhef.d(this.b, i, "@FieldMap keys must be of type String: ".concat(String.valueOf(String.valueOf(typeH3))), new Object[0]);
                        }
                        fhbv fhbvVarC = this.a.c(fhef.h(1, parameterizedType3));
                        this.f = true;
                        fhdfVar = new fhda(this.b, i, fhbvVarC, ((fhet) annotation).a());
                    } else if (annotation instanceof fhfg) {
                        d(i, type);
                        if (!this.q) {
                            throw fhef.d(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                        }
                        fhfg fhfgVar = (fhfg) annotation;
                        this.g = true;
                        String strB = fhfgVar.b();
                        Class clsA8 = fhef.a(type);
                        if (!strB.isEmpty()) {
                            feyn feynVarC = feym.c(ffho.c, a.a(strB, "form-data; name=\"", "\""), ffho.b, fhfgVar.a());
                            if (Iterable.class.isAssignableFrom(clsA8)) {
                                if (!(type instanceof ParameterizedType)) {
                                    throw fhef.d(this.b, i, e(clsA8), new Object[0]);
                                }
                                Type typeH4 = fhef.h(0, (ParameterizedType) type);
                                if (feyv.class.isAssignableFrom(fhef.a(typeH4))) {
                                    throw fhef.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                                fhdmVar = new fhcw(new fhde(this.b, i, feynVarC, this.a.d(typeH4, this.c)));
                            } else if (clsA8.isArray()) {
                                Class clsC = c(clsA8.getComponentType());
                                if (feyv.class.isAssignableFrom(clsC)) {
                                    throw fhef.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                                fhdmVar = new fhcx(new fhde(this.b, i, feynVarC, this.a.d(clsC, this.c)));
                            } else {
                                if (feyv.class.isAssignableFrom(clsA8)) {
                                    throw fhef.d(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                }
                                fhdfVar = new fhde(this.b, i, feynVarC, this.a.d(type, this.c));
                            }
                        } else if (Iterable.class.isAssignableFrom(clsA8)) {
                            if (!(type instanceof ParameterizedType)) {
                                throw fhef.d(this.b, i, e(clsA8), new Object[0]);
                            }
                            if (!feyv.class.isAssignableFrom(fhef.a(fhef.h(0, (ParameterizedType) type)))) {
                                throw fhef.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            fhdmVar = new fhcw(fhdk.a);
                        } else if (clsA8.isArray()) {
                            if (!feyv.class.isAssignableFrom(clsA8.getComponentType())) {
                                throw fhef.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            fhdmVar = new fhcx(fhdk.a);
                        } else {
                            if (!feyv.class.isAssignableFrom(clsA8)) {
                                throw fhef.d(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            fhdmVar = fhdk.a;
                        }
                    } else if (annotation instanceof fhfh) {
                        d(i, type);
                        if (!this.q) {
                            throw fhef.d(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        }
                        this.g = true;
                        Class clsA9 = fhef.a(type);
                        if (!Map.class.isAssignableFrom(clsA9)) {
                            throw fhef.d(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                        }
                        Type typeI4 = fhef.i(type, clsA9, Map.class);
                        if (!(typeI4 instanceof ParameterizedType)) {
                            throw fhef.d(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                        Type typeH5 = fhef.h(0, parameterizedType4);
                        if (typeH5 != String.class) {
                            throw fhef.d(this.b, i, "@PartMap keys must be of type String: ".concat(String.valueOf(String.valueOf(typeH5))), new Object[0]);
                        }
                        Type typeH6 = fhef.h(1, parameterizedType4);
                        if (feyv.class.isAssignableFrom(fhef.a(typeH6))) {
                            throw fhef.d(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        fhdfVar = new fhdf(this.b, i, this.a.d(typeH6, this.c), ((fhfh) annotation).a());
                    } else if (annotation instanceof fheq) {
                        d(i, type);
                        if (this.p || this.q) {
                            throw fhef.d(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        }
                        if (this.h) {
                            throw fhef.d(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                        }
                        try {
                            fhbv fhbvVarD = this.a.d(type, this.c);
                            this.h = true;
                            fhcyVar = new fhcy(this.b, i, fhbvVarD);
                            fhdmVar = fhcyVar;
                        } catch (RuntimeException e) {
                            throw fhef.e(this.b, e, i, "Unable to create @Body converter for %s", type);
                        }
                    } else if (annotation instanceof fhfn) {
                        d(i, type);
                        Class clsA10 = fhef.a(type);
                        for (int i2 = i - 1; i2 >= 0; i2--) {
                            fhdn fhdnVar2 = this.v[i2];
                            if ((fhdnVar2 instanceof fhdm) && ((fhdm) fhdnVar2).a.equals(clsA10)) {
                                throw fhef.d(this.b, i, "@Tag type " + clsA10.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                            }
                        }
                        fhdmVar = new fhdm(clsA10);
                    } else {
                        fhdmVar = null;
                    }
                    fhdmVar = fhdfVar;
                }
                if (fhdmVar != null) {
                    if (fhdnVar != null) {
                        throw fhef.d(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    fhdnVar = fhdmVar;
                }
            }
        } else {
            fhdnVar = null;
        }
        if (fhdnVar != null) {
            return fhdnVar;
        }
        if (z) {
            try {
                if (fhef.a(type) == fcxy.class) {
                    this.w = true;
                    return null;
                }
            } catch (NoClassDefFoundError unused) {
            }
        }
        throw fhef.d(this.b, i, "No Retrofit annotation found.", new Object[0]);
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.n;
        if (str3 != null) {
            throw fhef.b(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.n = str;
        this.o = z;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (x.matcher(strSubstring).find()) {
                throw fhef.b(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.r = str2;
        Matcher matcher = x.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.u = linkedHashSet;
    }
}
