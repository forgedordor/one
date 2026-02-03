package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckcu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckcv b;
    final /* synthetic */ MessageId c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckcu(ckcv ckcvVar, MessageId messageId, long j, int i, int i2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckcvVar;
        this.c = messageId;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckcu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckcv ckcvVar = this.b;
            MessageId messageId = this.c;
            this.a = 1;
            obj = ckcvVar.a(messageId, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Duration duration = (Duration) obj;
        if (duration == null) {
            duration = Duration.ZERO;
        }
        ckcv ckcvVar2 = this.b;
        long j = this.d;
        int i2 = this.e;
        int i3 = this.f;
        enfz enfzVar = (enfz) enga.a.createBuilder();
        enfzVar.getClass();
        enug.c(true, enfzVar);
        duration.getClass();
        enug.b(evxd.a(duration), enfzVar);
        enfzVar.copyOnWrite();
        enga engaVar = (enga) enfzVar.instance;
        engaVar.b |= 8;
        engaVar.h = i2;
        enfzVar.copyOnWrite();
        enga engaVar2 = (enga) enfzVar.instance;
        engaVar2.b |= 4;
        engaVar2.g = i3;
        engb engbVar = (engb) engc.a.createBuilder();
        engbVar.getClass();
        enuh.b(true, engbVar);
        enug.d(enuh.a(engbVar), enfzVar);
        aiqu.b(ckcvVar2.b, j, 4, 0, null, null, enug.a(enfzVar), 56);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckcu(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
