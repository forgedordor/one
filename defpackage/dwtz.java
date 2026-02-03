package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtz extends dwua {
    private final dwwm a;

    public dwtz(dwwm dwwmVar) {
        this.a = dwwmVar;
    }

    @Override // defpackage.dwwh
    public final dwwe a() {
        return dwwe.UI_ELEMENT;
    }

    @Override // defpackage.dwua, defpackage.dwwh
    public final dwwm c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwh) {
            dwwh dwwhVar = (dwwh) obj;
            if (dwwe.UI_ELEMENT == dwwhVar.a() && this.a.equals(dwwhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiComponent{uiElement=" + this.a.toString() + "}";
    }
}
