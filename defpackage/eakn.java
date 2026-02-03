package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakn {
    public static final eakn a;
    private static final /* synthetic */ eakn[] b;

    static {
        eakn eaknVar = new eakn();
        a = eaknVar;
        b = new eakn[]{eaknVar};
    }

    private eakn() {
    }

    public static eakn valueOf(String str) {
        return (eakn) Enum.valueOf(eakn.class, str);
    }

    public static eakn[] values() {
        return (eakn[]) b.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        return ordinal() != 0 ? super.toString() : "routing_summaries";
    }
}
