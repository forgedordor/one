package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpue implements Supplier {
    epkh a = epkh.a;
    boolean b = false;
    final /* synthetic */ cpug c;

    public cpue(cpug cpugVar) {
        this.c = cpugVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized epkh get() {
        if (!this.b) {
            try {
                evqe evqeVar = this.c.b.e;
                if (evqeVar == null) {
                    evqeVar = evqe.a;
                }
                this.a = (epkh) evsn.parseFrom(epkh.a, evqeVar.c);
                this.b = true;
            } catch (evtj e) {
                cpug.a.o("Failed to create ParticipantModel\n", e);
                throw new cpuf(e);
            }
        }
        return this.a;
    }
}
