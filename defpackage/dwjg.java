package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjg {
    public abstract void a(String str);

    public abstract void b(String str);

    public abstract void c(Set set);

    public abstract void d(String str);

    public final void e(dwpk dwpkVar) {
        d(dwpkVar.e());
        dwpj dwpjVar = dwpj.UNKNOWN;
        int iOrdinal = dwpkVar.b().ordinal();
        if (iOrdinal == 1) {
            c(new ekph(dwpkVar.d()));
            return;
        }
        if (iOrdinal == 2) {
            b(dwpkVar.d());
            c(ekon.a);
        } else if (iOrdinal == 4) {
            a(dwpkVar.d());
            c(ekon.a);
        } else {
            dvhv.c("AccountUsers", "Absent contact type");
            b(dwpkVar.d());
            c(ekon.a);
        }
    }
}
