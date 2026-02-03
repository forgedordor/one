package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbo extends dbye {
    private final eyfb b;
    private final eyfd c;

    /* JADX WARN: Multi-variable type inference failed */
    public dcbo(eyfb eyfbVar, dbyr dbyrVar) {
        Random random = new Random();
        eyfc eyfcVar = (eyfc) eyfd.a.createBuilder();
        double d = dbyrVar.c;
        eyfcVar.copyOnWrite();
        eyfd eyfdVar = (eyfd) eyfcVar.instance;
        eyfdVar.b |= 1;
        eyfdVar.c = d;
        eyfd eyfdVar2 = (eyfd) eyfcVar.build();
        super(random);
        this.b = eyfbVar;
        this.c = eyfdVar2;
    }

    @Override // defpackage.dbye
    public final ListenableFuture a(dbzx dbzxVar) {
        dbzy dbzyVarC;
        eyfd eyfdVar = this.c;
        double d = eyfdVar.c;
        if (d <= 0.0d) {
            dbzyVarC = dbzy.a;
        } else if (d == 1.0d && (eyfdVar.b & 2) == 0) {
            dbzyVarC = dbzy.e;
        } else {
            double dNextDouble = this.a.nextDouble();
            double d2 = eyfdVar.c;
            boolean z = dNextDouble < d2;
            if ((eyfdVar.b & 2) != 0) {
                d2 = eyfdVar.d;
            }
            dbzyVarC = dbzy.c(z, d2);
        }
        return eork.i(dbzyVarC);
    }

    @Override // defpackage.dbye
    public final eyeg b() {
        eyeb eyebVar = (eyeb) eyeg.a.createBuilder();
        eyebVar.copyOnWrite();
        eyeg eyegVar = (eyeg) eyebVar.instance;
        eyegVar.c = this.b.a();
        eyegVar.b |= 1;
        eyee eyeeVar = (eyee) eyef.a.createBuilder();
        float f = (float) this.c.c;
        eyeeVar.copyOnWrite();
        eyef eyefVar = (eyef) eyeeVar.instance;
        eyefVar.b |= 1;
        eyefVar.c = f;
        eyebVar.copyOnWrite();
        eyeg eyegVar2 = (eyeg) eyebVar.instance;
        eyef eyefVar2 = (eyef) eyeeVar.build();
        eyefVar2.getClass();
        eyegVar2.e = eyefVar2;
        eyegVar2.b |= 4;
        return (eyeg) eyebVar.build();
    }
}
