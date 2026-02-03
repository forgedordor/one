package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydj extends dycx {
    public dycw a;
    public dycw b;
    public dycw c;

    @Override // defpackage.dycx
    public final dycy a() {
        dycw dycwVar;
        dycw dycwVar2;
        dycw dycwVar3 = this.a;
        if (dycwVar3 != null && (dycwVar = this.b) != null && (dycwVar2 = this.c) != null) {
            return new dydk(dycwVar3, dycwVar, dycwVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" myAccountClickListener");
        }
        if (this.b == null) {
            sb.append(" useAnotherAccountClickListener");
        }
        if (this.c == null) {
            sb.append(" manageAccountsClickListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
