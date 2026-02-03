package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.dclw;
import defpackage.efhh;
import defpackage.efik;
import defpackage.efil;
import defpackage.efim;
import defpackage.ejun;
import defpackage.ejuq;
import defpackage.ejux;
import defpackage.ejuy;
import defpackage.ejvb;
import defpackage.ejvf;
import defpackage.ejwl;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.ekoj;
import defpackage.ekqg;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eotp;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ContentType implements Parcelable {
    public static final Parcelable.Creator<ContentType> CREATOR;
    private static final ekrg a = ekrg.c("com/google/android/rcs/client/messaging/data/ContentType");
    private static final ejvf b;
    private static final ejvf c;
    public static final ContentType d;
    private static final ejvf e;

    static {
        efil efilVarD = d();
        efilVarD.f("application");
        efilVarD.e("octet-stream");
        d = efilVarD.g();
        CREATOR = new efik();
        b = new ejun(new ejun(new ejun(ejuq.a, new ejvb(ejuy.a)), new ejux(' ')), ejvf.n("()<>@,;:\\\"/[]?="));
        c = new ejun(ejuq.a, ejvf.n("\"\\\r"));
        e = ejvf.m(" \t\r\n");
    }

    public static efil d() {
        efhh efhhVar = new efhh();
        efhhVar.h(ekoj.a);
        return efhhVar;
    }

    public static ContentType e(String str) {
        String strB;
        efim efimVar = new efim(str);
        try {
            ejvf ejvfVar = b;
            String strB2 = efimVar.b(ejvfVar);
            efimVar.e('/');
            String strC = efimVar.c(ejvfVar);
            ekgi ekgiVar = new ekgi();
            while (efimVar.d()) {
                ejvf ejvfVar2 = e;
                efimVar.c(ejvfVar2);
                efimVar.e(';');
                efimVar.c(ejvfVar2);
                String strB3 = efimVar.b(ejvfVar);
                efimVar.e('=');
                if (efimVar.a() == '\"') {
                    efimVar.e('\"');
                    StringBuilder sb = new StringBuilder();
                    while (efimVar.a() != '\"') {
                        if (efimVar.a() == '\\') {
                            efimVar.e('\\');
                            ejvf ejvfVar3 = ejuq.a;
                            ejwl.l(efimVar.d());
                            char cA = efimVar.a();
                            ejwl.l(ejvfVar3.c(cA));
                            efimVar.b++;
                            sb.append(cA);
                        } else {
                            sb.append(efimVar.b(c));
                        }
                    }
                    strB = sb.toString();
                    efimVar.e('\"');
                } else {
                    strB = efimVar.b(ejvfVar);
                }
                ekgiVar.i(strB3, strB);
            }
            efil efilVarD = d();
            efilVarD.f(strB2);
            efilVarD.e(strC);
            efilVarD.h(ekgiVar.c());
            return efilVarD.g();
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException(a.a(str, "Could not parse '", "'"), e2);
        }
    }

    public abstract ekgp a();

    public abstract String b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String f() {
        if (!eotp.a("cslib.enable_stringify_content_type_without_parameters", "cslib")) {
            return toString();
        }
        return c() + '/' + b();
    }

    public final boolean g(ContentType contentType) {
        return contentType != null && c().equals(contentType.c()) && b().equals(contentType.b());
    }

    public final boolean h(String str) {
        if (str == null) {
            return false;
        }
        try {
            return g(e(str));
        } catch (IllegalArgumentException e2) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e2)).h("com/google/android/rcs/client/messaging/data/ContentType", "describesSameContentAs", 117, "ContentType.java")).t("Failed to parse content type: %s", str);
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append('/');
        sb.append(b());
        ekqg ekqgVarListIterator = a().entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, toString(), false);
        dclw.c(parcel, iA);
    }
}
