package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwk extends bwh {
    public Range a;
    public Integer b;
    public Integer c;
    public Range d;
    private Integer e;

    @Override // defpackage.bwh
    public final bwi a() {
        Range range = this.a;
        Integer num = this.b;
        String strConcat = range == null ? " bitrate" : "";
        if (num == null) {
            strConcat = strConcat.concat(" sourceFormat");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" source");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" sampleRate");
        }
        if (this.e == null) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        Range range2 = this.a;
        this.b.intValue();
        this.c.intValue();
        return new bwl(range2, this.d, this.e.intValue());
    }

    @Override // defpackage.bwh
    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }
}
