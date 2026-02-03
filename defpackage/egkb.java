package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkb implements efzm {
    final /* synthetic */ egkc a;

    public egkb(egkc egkcVar) {
        this.a = egkcVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        final efwo efwoVarA = efzkVar.a();
        final egkc egkcVar = this.a;
        egoc.d("com/google/apps/tiktok/account/ui/defaultselector/DefaultAccountSelector$1", "onAccountChanged", 77, egkcVar.a.c(eiid.d(new eooz() { // from class: egka
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final egkc egkcVar2 = egkcVar;
                final egkf egkfVar = (egkf) obj;
                final efwo efwoVar = efwoVarA;
                if (efwoVar != null) {
                    return eooq.f(egkcVar2.c.c(efwoVar), eiid.a(new ejvr() { // from class: egjy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            egbe egbeVar = (egbe) obj2;
                            ejwl.l(egbeVar.c() == 2);
                            boolean zEquals = egbeVar.b().k.equals("incognito");
                            egkf egkfVar2 = egkfVar;
                            if (zEquals) {
                                return egkfVar2;
                            }
                            efwo efwoVar2 = efwoVar;
                            egkc egkcVar3 = egkcVar2;
                            egkd egkdVar = (egkd) egkfVar2.toBuilder();
                            String str = egkcVar3.b;
                            int iA = efwoVar2.a();
                            str.getClass();
                            egkdVar.copyOnWrite();
                            ((egkf) egkdVar.instance).a().put(str, Integer.valueOf(iA));
                            return (egkf) egkdVar.build();
                        }
                    }), eoqg.a);
                }
                egkd egkdVar = (egkd) egkfVar.toBuilder();
                egkdVar.a(egkcVar2.b);
                return eork.i((egkf) egkdVar.build());
            }
        }), eoqg.a), "Failed to set default account.", new Object[0]);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
    }
}
