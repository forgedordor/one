package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmt extends RuntimeException implements fdjj {
    public wmt(String str, Throwable th) {
        super(str, th);
    }

    @Override // defpackage.fdjj
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        message.getClass();
        return new wmt(message, getCause());
    }
}
