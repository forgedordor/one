package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzj extends cpza {
    public final String a;

    public cpzj(int i, String str) {
        super(i, cpyz.NO_RETRY, String.format("Part id %s failed to be backed up due to insufficient SQS storage!", str));
        this.a = str;
    }
}
