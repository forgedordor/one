package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aokh implements aokm {
    private final awhe a;
    private final awhe b;

    public aokh(awhe awheVar, awhe awheVar2) {
        awheVar.getClass();
        awheVar2.getClass();
        this.a = awheVar;
        this.b = awheVar2;
    }

    private static final boolean k(awhe awheVar, String str, boolean z) {
        String strA = awheVar.a(str);
        return strA != null ? Boolean.parseBoolean(strA) : z;
    }

    private static final int l(awhe awheVar, String str, int i) {
        String strA = awheVar.a(str);
        return strA != null ? Integer.parseInt(strA) : i;
    }

    @Override // defpackage.aokm
    public final int a() {
        return l(this.b, "EMAIL_SMS_TO_MMS_THRESHOLD", -1);
    }

    @Override // defpackage.aokm
    public final int b() {
        return l(this.b, "MAX_MESSAGE_SIZE", 307200);
    }

    @Override // defpackage.aokm
    public final int c() {
        return l(this.b, "MAX_SUBJECT_LENGTH", 40);
    }

    @Override // defpackage.aokm
    public final int d() {
        return l(this.b, "MAX_TEXT_LENGTH", -1);
    }

    @Override // defpackage.aokm
    public final int e() {
        return l(this.a, "SMS_MAX_TEXT_PARTS", -1);
    }

    @Override // defpackage.aokm
    public final int f() {
        return l(this.a, "SMS_TO_MMS_TEXT_LENGTH_THRESHOLD", -1);
    }

    @Override // defpackage.aokm
    public final String g() {
        String strA = this.b.a("EMAIL_GATEWAY");
        return strA == null ? "" : strA;
    }

    @Override // defpackage.aokm
    public final boolean h() {
        return k(this.b, "GROUP_MMS_ENABLED", true);
    }

    @Override // defpackage.aokm
    public final boolean i() {
        return k(this.b, "MMS_ENABLED", true);
    }

    @Override // defpackage.aokm
    public final boolean j() {
        return k(this.a, "SIMPLE_CHARACTERS_ONLY", false);
    }
}
