package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwup implements bvuz {
    public final ecjh a;
    public final eosc b;
    private final egyt c;
    private final eosc d;
    private final egzh e;
    private final bvur f;

    public bwup(ecjh ecjhVar, eosc eoscVar, eosc eoscVar2, egyt egytVar, egzh egzhVar, bvur bvurVar) {
        this.a = ecjhVar;
        this.d = eoscVar;
        this.b = eoscVar2;
        this.c = egytVar;
        this.e = egzhVar;
        this.f = bvurVar;
    }

    @Override // defpackage.bvuz
    public final egyi a() {
        return new egys(this.c, new eopk() { // from class: bwuj
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(this.a.d());
            }
        }, "user_etouffee_settings_data_service");
    }

    @Override // defpackage.bvuz
    public final egyi b() {
        return new egys(this.c, new eopk() { // from class: bwul
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                bwup bwupVar = this.a;
                return new eopy(eiju.g(bwupVar.a.a()).h(new ejvr() { // from class: bwuk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((bwuf) obj).d);
                    }
                }, bwupVar.b));
            }
        }, "user_etouffee_enabled_setting_data_service");
    }

    @Override // defpackage.bvuz
    public final eiju c(boolean z) {
        return (z && this.f.l()) ? d() : eijx.e(true);
    }

    @Override // defpackage.bvuz
    public final eiju d() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: bwum
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bwuf) obj).c);
            }
        }, this.b);
    }

    @Override // defpackage.bvuz
    public final eiju e(final boolean z) {
        return eiju.g(this.a.b(new ejvr() { // from class: bwun
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bwue bwueVar = (bwue) ((bwuf) obj).toBuilder();
                bwueVar.copyOnWrite();
                bwuf bwufVar = (bwuf) bwueVar.instance;
                bwufVar.b |= 1;
                bwufVar.c = z;
                return (bwuf) bwueVar.build();
            }
        }, this.d)).h(new ejvr() { // from class: bwuo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.g("user_etouffee_settings_data_service");
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.bvuz
    public final eiju f(final boolean z) {
        return eiju.g(this.a.b(new ejvr() { // from class: bwuh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bwue bwueVar = (bwue) ((bwuf) obj).toBuilder();
                bwueVar.copyOnWrite();
                bwuf bwufVar = (bwuf) bwueVar.instance;
                bwufVar.b |= 2;
                bwufVar.d = z;
                return (bwuf) bwueVar.build();
            }
        }, this.d)).h(new ejvr() { // from class: bwui
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.g("user_etouffee_enabled_setting_data_service");
                return null;
            }
        }, this.b);
    }

    public final void g(String str) {
        this.e.a(eijx.e(null), str);
    }
}
