package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjp implements efze, efzf {
    private static final Duration a = Duration.ofDays(1);
    private final egjr b;
    private final boolean c;

    public egjp(egjr egjrVar, ejwi ejwiVar) {
        this.b = egjrVar;
        this.c = ((Boolean) ejwiVar.e(false)).booleanValue();
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        if (this.c) {
            egjr egjrVar = this.b;
            Duration duration = a;
            eieu eieuVarK = eiiy.k("AutoSelect Account New");
            try {
                ListenableFuture listenableFutureF = eooq.f(egjrVar.c.d(duration), eiid.a(new ejvr() { // from class: egjq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        for (egbe egbeVar : (List) obj) {
                            if (egbeVar.c() != 3 && !Objects.equals(egbeVar.b().k, "pseudonymous") && !Objects.equals(egbeVar.b().k, "incognito")) {
                                arrayList.add(egbeVar);
                            }
                        }
                        if (arrayList.size() == 1) {
                            return ((egbe) arrayList.get(0)).a();
                        }
                        return null;
                    }
                }), eoqg.a);
                eieuVarK.b(listenableFutureF);
                eieuVarK.close();
                return listenableFutureF;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        egjr egjrVar2 = this.b;
        egzr egzrVar = egzr.SAME_DAY;
        eieu eieuVarK2 = eiiy.k("AutoSelect Account Legacy");
        try {
            ListenableFuture listenableFutureF2 = eooq.f(egjrVar2.a.a(egjrVar2.c.b(), egzrVar), eiid.a(new ejvr() { // from class: egjq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ArrayList arrayList = new ArrayList();
                    for (egbe egbeVar : (List) obj) {
                        if (egbeVar.c() != 3 && !Objects.equals(egbeVar.b().k, "pseudonymous") && !Objects.equals(egbeVar.b().k, "incognito")) {
                            arrayList.add(egbeVar);
                        }
                    }
                    if (arrayList.size() == 1) {
                        return ((egbe) arrayList.get(0)).a();
                    }
                    return null;
                }
            }), eoqg.a);
            eieuVarK2.b(listenableFutureF2);
            eieuVarK2.close();
            return listenableFutureF2;
        } catch (Throwable th3) {
            try {
                eieuVarK2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        return this.b.b.a(efwoVar);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
