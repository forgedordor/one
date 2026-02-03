package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esvx extends ekuc {
    private final ekgb a;

    public esvx(String str, ekgb ekgbVar) {
        super(str);
        this.a = ekgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekta
    public final void b(eksx eksxVar) {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return;
            }
            ekta ektaVar = (ekta) ekgbVar.get(i);
            if (eksxVar.R() || ektaVar.c(eksxVar.m())) {
                ektaVar.b(eksxVar);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekta
    public final boolean c(Level level) {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return false;
            }
            if (((ekta) ekgbVar.get(i)).c(level)) {
                return true;
            }
            i++;
        }
    }
}
