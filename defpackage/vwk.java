package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwk {
    public static final vwk a;
    public static final vwk b;
    public static final vwk c;
    public static final vwk d;
    public static final vwk e;
    private static final /* synthetic */ vwk[] g;
    public final elny f;

    static {
        vwk vwkVar = new vwk("CONVERSATION_FULLSCREEN", 0, elny.CONVERSATION_ACTIVITY);
        a = vwkVar;
        vwk vwkVar2 = new vwk("CONVERSATION_BUBBLE", 1, elny.BUBBLE);
        b = vwkVar2;
        vwk vwkVar3 = new vwk("DIRECT_SEND", 2, elny.DIRECT_SEND_FULL_SCREEN);
        c = vwkVar3;
        vwk vwkVar4 = new vwk("SMART_REPLY", 3, elny.CONVERSATION_ACTIVITY);
        d = vwkVar4;
        vwk vwkVar5 = new vwk("MEDIA_VIEWER", 4, elny.MEDIA_FULL_SCREEN);
        e = vwkVar5;
        vwk[] vwkVarArr = {vwkVar, vwkVar2, vwkVar3, vwkVar4, vwkVar5};
        g = vwkVarArr;
        fczb.a(vwkVarArr);
    }

    private vwk(String str, int i, elny elnyVar) {
        this.f = elnyVar;
    }

    public static vwk[] values() {
        return (vwk[]) g.clone();
    }
}
