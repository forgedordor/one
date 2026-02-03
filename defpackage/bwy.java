package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwy extends caw {
    public Integer a;
    public Range b;
    private bxs c;
    private Integer d;

    public bwy() {
    }

    @Override // defpackage.caw
    public final cax a() {
        bxs bxsVar = this.c;
        Integer num = this.a;
        String strConcat = bxsVar == null ? " qualitySelector" : "";
        if (num == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (this.b == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" aspectRatio");
        }
        if (strConcat.isEmpty()) {
            return new bwz(this.c, this.a.intValue(), this.b, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.caw
    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.caw
    public final void c(bxs bxsVar) {
        if (bxsVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        this.c = bxsVar;
    }

    public bwy(cax caxVar) {
        bwz bwzVar = (bwz) caxVar;
        this.c = bwzVar.a;
        this.a = Integer.valueOf(bwzVar.b);
        this.b = bwzVar.c;
        this.d = Integer.valueOf(bwzVar.d);
    }
}
