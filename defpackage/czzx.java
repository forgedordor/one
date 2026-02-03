package defpackage;

import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzx implements cdfg {
    private final eosc a;
    private final cmea b;

    public czzx(eosc eoscVar, cmea cmeaVar) {
        this.a = eoscVar;
        this.b = cmeaVar;
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        return d().h(new ejvr() { // from class: czzw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                StringBuilder sb = new StringBuilder("Section: ZeroStateSearch/Icing\n");
                for (cdff cdffVar : (List) obj) {
                    sb.append(cdffVar.a());
                    sb.append(": ");
                    sb.append(cdffVar.b());
                    sb.append("\n");
                }
                return sb.toString();
            }
        }, this.a);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        cmea cmeaVar = this.b;
        eiju eijuVarB = cmeaVar.b();
        ejvr ejvrVar = new ejvr() { // from class: czzu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Instant instantOfEpochMilli = Instant.ofEpochMilli(((Long) obj).longValue());
                cdew cdewVar = new cdew();
                cdewVar.b("last_search_time");
                cdewVar.c(String.valueOf(instantOfEpochMilli));
                return cdewVar.a();
            }
        };
        eosc eoscVar = this.a;
        return eijx.b(eijuVarB.h(ejvrVar, eoscVar), cmeaVar.a().h(new ejvr() { // from class: czzv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cdew cdewVar = new cdew();
                cdewVar.b("last_index_refresh_request_time");
                cdewVar.c(String.valueOf((Instant) obj));
                return cdewVar.a();
            }
        }, eoscVar));
    }
}
