package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obv {
    public final ekgb a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public obv(obu obuVar) {
        this.a = obuVar.a.g();
        mee.b(!r3.isEmpty(), "The sequence must contain at least one EditedMediaItem.");
        mee.b(!((obt) r3.get(0)).b(), "If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set");
        this.b = false;
        this.c = false;
        this.d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean a() {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return false;
            }
            if (((obt) ekgbVar.get(i)).b()) {
                return true;
            }
            i++;
        }
    }
}
