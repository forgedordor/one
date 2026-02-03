package defpackage;

import android.content.Context;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqp implements rez {
    private static final rqo a = new rqo();
    private final Context b;
    private final List c;
    private final rqo d;
    private final rqq e;

    public rqp(Context context, List list, rii riiVar, rig rigVar) {
        rqo rqoVar = a;
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = new rqq(riiVar, rigVar);
        this.d = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x03a0 A[Catch: all -> 0x03b7, TryCatch #1 {all -> 0x03b7, blocks: (B:3:0x0014, B:139:0x0307, B:141:0x030d, B:142:0x0322, B:147:0x034d, B:149:0x0353, B:150:0x036a, B:152:0x0373, B:163:0x039a, B:165:0x03a0, B:166:0x03b6), top: B:172:0x0014 }] */
    @Override // defpackage.rez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.rhy a(java.lang.Object r20, int r21, int r22, defpackage.rex r23) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqp.a(java.lang.Object, int, int, rex):rhy");
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return !((Boolean) rexVar.b(rrb.b)).booleanValue() && rer.c(this.c, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }
}
