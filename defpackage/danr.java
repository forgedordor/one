package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class danr implements eora {
    final /* synthetic */ ddkb a;

    public danr(ddkb ddkbVar) {
        this.a = ddkbVar;
    }

    @Override // defpackage.eora
    public final /* synthetic */ void b(Object obj) {
        ListIterator listIterator = (ListIterator) obj;
        if (!listIterator.hasNext()) {
            this.a.b(null, null);
            return;
        }
        cdel cdelVar = (cdel) listIterator.next();
        fgvo fgvoVar = (fgvo) fgvq.a.createBuilder();
        fgvoVar.a("timestamp", damm.a(cdelVar.g));
        fgvoVar.a("event_type", damm.a(cdelVar.a.i));
        fgvoVar.a("reply_mode", damm.a(cdelVar.b.d));
        fgvoVar.a("rejection_reason", damm.a(cdelVar.d.a()));
        fgvoVar.a("action_source", damm.a(cdelVar.c.a()));
        fgvoVar.a("num_of_items", damm.a(cdelVar.e));
        fgvoVar.a("click_index", damm.a(cdelVar.f));
        fgvoVar.a("impression_id", damm.c(cdelVar.h));
        fgvoVar.a("suggestion_types", damm.b(cdelVar.i));
        ekgb ekgbVar = cdelVar.j;
        fgvoVar.a("num_of_labels", damm.a(((ekoe) ekgbVar).c));
        fgvoVar.a("model_output_labels", damm.d(ekgbVar));
        fgvk fgvkVar = (fgvk) fgvl.a.createBuilder();
        fgvq fgvqVar = (fgvq) fgvoVar.build();
        fgvkVar.copyOnWrite();
        fgvl fgvlVar = (fgvl) fgvkVar.instance;
        fgvqVar.getClass();
        fgvlVar.c = fgvqVar;
        fgvlVar.b |= 1;
        this.a.b(((fgvl) fgvkVar.build()).toByteArray(), null);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.a(13, null);
    }
}
