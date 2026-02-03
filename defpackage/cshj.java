package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cshj implements eora {
    final /* synthetic */ cshk a;

    public cshj(cshk cshkVar) {
        this.a = cshkVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cshk.a.p("MoiraiApi was initialized");
        synchronized (cshk.c) {
            this.a.g = true;
        }
        if (((Boolean) cshk.b.e()).booleanValue()) {
            ((ajfo) this.a.e.b()).b(new dzfh("Moirai API initialized"));
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof dhvf) {
            cshh cshhVar = (cshh) this.a.f.b();
            int i = ((dhvf) th).c;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            cshhVar.a(i2);
        } else {
            ((cshh) this.a.f.b()).a(-1);
        }
        synchronized (cshk.c) {
            cshk.a.s("Failed to initialize MoiraiApi.", th);
            cshk cshkVar = this.a;
            cshkVar.k = ((cogw) cshkVar.i.b()).f().toEpochMilli() + Math.round(((Integer) cshq.a.e()).intValue() * Math.pow(((Integer) cshq.b.e()).intValue(), cshkVar.j - 1));
        }
        cshk cshkVar2 = this.a;
        boolean andSet = cshkVar2.h.getAndSet(true);
        if (!((Boolean) cshk.b.e()).booleanValue() || andSet) {
            return;
        }
        ((ajfo) cshkVar2.e.b()).b(new dzfh("Moirai API initialized"));
    }
}
