package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpu implements eyif {
    public static dvhb a(Context context, Optional optional, final dwhx dwhxVar, final dwhu dwhuVar, cdrj cdrjVar, fcsu fcsuVar, cdrp cdrpVar, fcsu fcsuVar2) {
        Lighter lighterJ = Lighter.j(new cdpo(), context, new cdpp(), new cdpq(context), new cdpr(context), new cdps(fcsuVar, optional, fcsuVar2, cdrpVar), cdrjVar, new dvhd(dwsw.c(), dwgn.c()), new HashMap());
        final dwhw dwhwVarA = dwhw.a();
        dvie.b().a.submit(new Runnable() { // from class: dwhv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zB = fbex.a.get().b();
                dwhx dwhxVar2 = dwhxVar;
                if (zB) {
                    Set set = dwhwVarA.a;
                    synchronized (set) {
                        set.add(dwhxVar2);
                    }
                }
            }
        });
        final dwht dwhtVarA = dwht.a();
        dvie.b().a.submit(new Runnable() { // from class: dwhs
            @Override // java.lang.Runnable
            public final void run() {
                boolean zA = fbex.a.get().a();
                dwhu dwhuVar2 = dwhuVar;
                if (zA) {
                    Set set = dwhtVarA.a;
                    synchronized (set) {
                        set.add(dwhuVar2);
                    }
                }
            }
        });
        lighterJ.getClass();
        return lighterJ;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
