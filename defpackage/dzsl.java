package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dzsl implements Runnable {
    public final /* synthetic */ dzsn a;

    public /* synthetic */ dzsl(dzsn dzsnVar) {
        this.a = dzsnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        dzsn dzsnVar = this.a;
        long millis = dzsnVar.a.e().toMillis();
        long j = dzsnVar.h;
        long j2 = dzsnVar.g;
        long j3 = j - j2;
        boolean z = false;
        if (j3 >= 0) {
            dzsnVar.k.c = false;
            dzsb dzsbVar = dzsnVar.c;
            if (j3 > ((Integer) dzsbVar.h().get(0)).intValue()) {
                dzlm dzlmVar = dzsnVar.e;
                dzle dzleVarN = dzlf.n();
                feiw feiwVar = (feiw) feix.a.createBuilder();
                feiu feiuVar = (feiu) feiv.a.createBuilder();
                feiuVar.copyOnWrite();
                feiv feivVar = (feiv) feiuVar.instance;
                feivVar.b = 2;
                feivVar.c = Long.valueOf(j3);
                feiv feivVar2 = (feiv) feiuVar.build();
                feiwVar.copyOnWrite();
                feix feixVar = (feix) feiwVar.instance;
                feivVar2.getClass();
                feixVar.r = feivVar2;
                feixVar.b |= 262144;
                dzleVarN.f((feix) feiwVar.build());
                dzlmVar.b(dzleVarN.a());
                dzsnVar.f = 0;
            }
            dzsnVar.a(new dzsk(dzsnVar), dzsbVar.g());
            return;
        }
        long j4 = millis - j2;
        dzhl dzhlVar = dzsnVar.k;
        if (((Boolean) dzhlVar.a.b()).booleanValue() && !dzhlVar.c && j4 >= ((Long) dzhlVar.b.b()).longValue()) {
            dzhlVar.c = true;
            dzhlVar.d.a(3);
        }
        if (((Boolean) dzsnVar.b.b()).booleanValue() || j4 > ((Integer) dzsnVar.c.h().get(dzsnVar.f)).intValue()) {
            ekgb ekgbVarH = dzsnVar.c.h();
            if (dzsnVar.f != ekgbVarH.size() && j4 > ((Integer) ekgbVarH.get(dzsnVar.f)).intValue()) {
                while (dzsnVar.f != ekgbVarH.size() && j4 > ((Integer) ekgbVarH.get(dzsnVar.f)).intValue()) {
                    dzsnVar.f++;
                    z = true;
                }
                if (z) {
                    dzlm dzlmVar2 = dzsnVar.e;
                    dzle dzleVarN2 = dzlf.n();
                    feiw feiwVar2 = (feiw) feix.a.createBuilder();
                    feiu feiuVar2 = (feiu) feiv.a.createBuilder();
                    feiuVar2.copyOnWrite();
                    feiv feivVar3 = (feiv) feiuVar2.instance;
                    feivVar3.b = 1;
                    feivVar3.c = Long.valueOf(j4);
                    feiv feivVar4 = (feiv) feiuVar2.build();
                    feiwVar2.copyOnWrite();
                    feix feixVar2 = (feix) feiwVar2.instance;
                    feivVar4.getClass();
                    feixVar2.r = feivVar4;
                    feixVar2.b |= 262144;
                    dzleVarN2.f((feix) feiwVar2.build());
                    dzlmVar2.b(dzleVarN2.a());
                }
            }
        }
        dzsnVar.a(new dzsl(dzsnVar), dzsnVar.c.f());
    }
}
