package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import defpackage.dclb;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dcmo;
import defpackage.dcmw;
import defpackage.dcng;
import defpackage.dcnh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class FastJsonResponse {

    /* compiled from: PG */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final dcmo CREATOR = new dcmo();
        public final int a;
        protected final int b;
        protected final boolean c;
        protected final int d;
        protected final boolean e;
        protected final String f;
        public final int g;
        protected final Class h;
        protected final String i;
        public FieldMappingDictionary j;
        public StringToIntConverter k;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.g = i4;
            StringToIntConverter stringToIntConverter = null;
            if (str2 == null) {
                this.h = null;
                this.i = null;
            } else {
                this.h = SafeParcelResponse.class;
                this.i = str2;
            }
            if (converterWrapper != null && (stringToIntConverter = converterWrapper.b) == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.k = stringToIntConverter;
        }

        final String a() {
            String str = this.i;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map b() {
            String str = this.i;
            dclh.m(str);
            dclh.m(this.j);
            Map mapA = this.j.a(str);
            dclh.m(mapA);
            return mapA;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            dclb.b("versionCode", Integer.valueOf(this.a), arrayList);
            dclb.b("typeIn", Integer.valueOf(this.b), arrayList);
            dclb.b("typeInArray", Boolean.valueOf(this.c), arrayList);
            dclb.b("typeOut", Integer.valueOf(this.d), arrayList);
            dclb.b("typeOutArray", Boolean.valueOf(this.e), arrayList);
            dclb.b("outputFieldName", this.f, arrayList);
            dclb.b("safeParcelFieldId", Integer.valueOf(this.g), arrayList);
            dclb.b("concreteTypeName", a(), arrayList);
            Class cls = this.h;
            if (cls != null) {
                dclb.b("concreteType.class", cls.getCanonicalName(), arrayList);
            }
            StringToIntConverter stringToIntConverter = this.k;
            if (stringToIntConverter != null) {
                dclb.b("converterName", stringToIntConverter.getClass().getCanonicalName(), arrayList);
            }
            return dclb.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int iA = dclw.a(parcel);
            dclw.i(parcel, 1, i2);
            dclw.i(parcel, 2, this.b);
            dclw.d(parcel, 3, this.c);
            dclw.i(parcel, 4, this.d);
            dclw.d(parcel, 5, this.e);
            dclw.m(parcel, 6, this.f, false);
            dclw.i(parcel, 7, this.g);
            dclw.m(parcel, 8, a(), false);
            StringToIntConverter stringToIntConverter = this.k;
            dclw.k(parcel, 9, stringToIntConverter == null ? null : new ConverterWrapper(stringToIntConverter), i, false);
            dclw.c(parcel, iA);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.g = i3;
            this.h = cls;
            if (cls == null) {
                this.i = null;
            } else {
                this.i = cls.getCanonicalName();
            }
            this.k = null;
        }
    }

    private static final void d(StringBuilder sb, Field field, Object obj) {
        int i = field.b;
        if (i == 11) {
            Class cls = field.h;
            dclh.m(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(dcng.a((String) obj));
            sb.append("\"");
        }
    }

    protected static final Object e(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.k;
        if (stringToIntConverter != null) {
            obj = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    protected Object a(Field field) {
        if (field.h == null) {
            f();
            return null;
        }
        String str = field.f;
        f();
        dclh.j(true, "Concrete field shouldn't be value object: %s", str);
        boolean z = field.e;
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Map b();

    protected boolean c(Field field) {
        if (field.d != 11) {
            String str = field.f;
            g();
            return false;
        }
        boolean z = field.e;
        String str2 = field.f;
        if (z) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract void f();

    protected abstract void g();

    public String toString() {
        Map mapB = b();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapB.keySet()) {
            Field field = (Field) mapB.get(str);
            if (c(field)) {
                Object objE = e(field, a(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objE != null) {
                    switch (field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(dcmw.a((byte[]) objE));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(dcmw.b((byte[]) objE));
                            sb.append("\"");
                            break;
                        case 10:
                            dcnh.a(sb, (HashMap) objE);
                            break;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) objE;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        d(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                d(sb, field, objE);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
