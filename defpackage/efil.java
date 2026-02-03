package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efil {
    public abstract ContentType a();

    public abstract ekgi b();

    public abstract String c();

    public abstract String d();

    public abstract void e(String str);

    public abstract void f(String str);

    public final ContentType g() {
        f(ejuf.c(d()));
        e(ejuf.c(c()));
        return a();
    }

    public final void h(ekgp ekgpVar) {
        ekqg ekqgVarListIterator = ekgpVar.keySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            String str = (String) ekqgVarListIterator.next();
            String str2 = (String) ekgpVar.get(str);
            if (str2 != null) {
                b().i(ejuf.c(str), str2);
            }
        }
    }
}
