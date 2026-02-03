package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aish {
    public static final cczv a = cdag.t(cdag.b, "unexempted_bugle_event_types", ((ewtl) ewtm.a.createBuilder()).build(), new dzze() { // from class: aisf
        @Override // defpackage.dzze
        public final Object a(byte[] bArr) {
            return (ewtm) evsn.parseFrom(ewtm.a, bArr);
        }
    });
    public static final cczv b = cdag.t(cdag.b, "unexempted_bugle_event_codes", ((ewtl) ewtm.a.createBuilder()).build(), new dzze() { // from class: aisf
        @Override // defpackage.dzze
        public final Object a(byte[] bArr) {
            return (ewtm) evsn.parseFrom(ewtm.a, bArr);
        }
    });
    public static final cczv c = cdag.m(cdag.b, "disable_exempted_bugle_events_check", false);
    public static final cczv d = cdag.t(cdag.b, "unexempted_histogram_counters", ((ewtn) ewto.a.createBuilder()).build(), new dzze() { // from class: aisg
        @Override // defpackage.dzze
        public final Object a(byte[] bArr) {
            return (ewto) evsn.parseFrom(ewto.a, bArr);
        }
    });
}
