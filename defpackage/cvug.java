package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvug implements cvub {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/conversationscale/ConversationScaleDataServiceImpl");
    public final fcsu b;
    public final eosd c;
    private final fcsu d;
    private final egyt e;
    private final fcsu f;
    private cmfo g;

    public cvug(fcsu fcsuVar, fcsu fcsuVar2, egyt egytVar, fcsu fcsuVar3, eosd eosdVar) {
        this.d = fcsuVar;
        this.b = fcsuVar2;
        this.e = egytVar;
        this.f = fcsuVar3;
        this.c = eosdVar;
    }

    @Override // defpackage.cvub
    public final egyi a() {
        return ((Boolean) ((cczi) cvuh.a.get()).e()).booleanValue() ? new egys(this.e, new eopk() { // from class: cvuc
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                cvug cvugVar = this.a;
                return new eopy(cvugVar.c().h().h(new ejvr() { // from class: cvuf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cvua cvuaVar = (cvua) obj;
                        if (cvuaVar.d) {
                            return cvuaVar;
                        }
                        cvtz builder = cvuaVar.toBuilder();
                        float fFloatValue = ((Float) cvul.a.e()).floatValue();
                        builder.copyOnWrite();
                        cvua cvuaVar2 = (cvua) builder.instance;
                        cvuaVar2.b |= 1;
                        cvuaVar2.c = fFloatValue;
                        return builder.build();
                    }
                }, cvugVar.c));
            }
        }, "CONVERSATION_SCALE_CONTENT_KEY") : new egys(this.e, new eopk() { // from class: cvud
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(this.a.c().h());
            }
        }, "CONVERSATION_SCALE_CONTENT_KEY");
    }

    @Override // defpackage.cvub
    public final void b(final boolean z) {
        ((egzh) this.f.b()).a(c().j(new ejvr() { // from class: cvue
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cvua cvuaVar = (cvua) obj;
                cvtz builder = cvuaVar.toBuilder();
                builder.copyOnWrite();
                cvua cvuaVar2 = (cvua) builder.instance;
                cvuaVar2.b |= 2;
                boolean z2 = z;
                cvuaVar2.d = z2;
                float f = cvuaVar.c;
                builder.copyOnWrite();
                cvua cvuaVar3 = (cvua) builder.instance;
                cvuaVar3.b |= 1;
                cvuaVar3.c = f;
                cvua cvuaVarBuild = builder.build();
                cvug cvugVar = this.a;
                if (z2) {
                    ((ains) cvugVar.b.b()).c("Bugle.ConversationScale.ConversationScaleEnableCount.Count");
                    return cvuaVarBuild;
                }
                ((ains) cvugVar.b.b()).c("Bugle.ConversationScale.ConversationScaleDisableCount.Count");
                return cvuaVarBuild;
            }
        }), "CONVERSATION_SCALE_CONTENT_KEY");
    }

    public final cmfo c() {
        if (this.g == null) {
            cmgk cmgkVar = (cmgk) this.d.b();
            cmgg cmggVarC = cmgh.c();
            cmggVarC.d(cmfn.CONVERSATION_SCALE);
            cmggVarC.f(cvua.a);
            this.g = cmgkVar.a(cmggVarC.a());
        }
        return this.g;
    }
}
