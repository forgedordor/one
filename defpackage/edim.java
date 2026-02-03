package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edim {
    public final edgc a;
    public final eosc b;
    public final etul c;
    public final edgi d;
    public final ednl e;
    public volatile ListenableFuture f;
    public final lvy g = new lvy();
    private final edkt h;
    private final drjk i;

    public edim(edgc edgcVar, eosc eoscVar, etul etulVar, edgi edgiVar, edkt edktVar, drjk drjkVar, ednl ednlVar) {
        this.a = edgcVar;
        this.b = eoscVar;
        this.c = etulVar;
        this.d = edgiVar;
        this.h = edktVar;
        this.i = drjkVar;
        this.e = ednlVar;
    }

    public final void a(List list, ejvr ejvrVar) {
        int i = true != this.i.b((Uri) ekis.i(list, null)) ? 3 : 2;
        final edkt edktVar = this.h;
        this.f = eork.e(ekjz.g(list, new ejvr() { // from class: edks
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Uri uri = (Uri) obj;
                edea edeaVar = new edea();
                edeaVar.b();
                edeaVar.d();
                int iB = (int) fbgs.a.get().b();
                edkt edktVar2 = edktVar;
                rbr rbrVarQ = edktVar2.b.b(raw.c(edktVar2.a).b(), uri, edeaVar).q(new rtj().Q(iB, iB));
                if (eddy.a.contains(uri.getScheme())) {
                    rbrVarQ = (rbr) ((rbr) rbrVarQ.D(rha.c)).ai();
                }
                return rdo.a((rbr) rbrVarQ.z());
            }
        }));
        eork.r(this.f, new edil(this, ejvrVar, i), this.b);
    }
}
