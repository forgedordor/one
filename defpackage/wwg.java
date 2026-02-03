package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wwg extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ www c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwg(fcxy fcxyVar, www wwwVar) {
        super(3, fcxyVar);
        this.c = wwwVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wwg wwgVar = new wwg((fcxy) obj3, this.c);
        wwgVar.d = (fdpm) obj;
        wwgVar.b = obj2;
        return wwgVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdpuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            MessageId messageId = (MessageId) this.b;
            if (messageId != null) {
                www wwwVar = this.c;
                fdpuVar = new wwr(anov.a(wwwVar.d.i(messageId)), wwwVar);
            } else {
                fdpuVar = new fdpu(null);
            }
            this.a = 1;
            if (fdpy.c(r5, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
