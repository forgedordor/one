package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzg implements dfyz {
    private static final ekgb a = ekgb.s(1, 0);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dfyz
    public final dfyu a(dfyu[] dfyuVarArr) {
        dhja.c("Selecting non-vpn ImsNetworkInterface.", new Object[0]);
        ekgb ekgbVar = a;
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            dfyu dfyuVar = dfyuVarArr[((Integer) ekgbVar.get(i2)).intValue()];
            if (dfyuVar != null && dfyuVar.l()) {
                return dfyuVar;
            }
        }
        return null;
    }
}
