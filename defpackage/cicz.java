package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cicz extends fcyz implements fdat {
    final /* synthetic */ ajlk a;
    final /* synthetic */ cida b;
    final /* synthetic */ ajli c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cicz(ajlk ajlkVar, cida cidaVar, ajli ajliVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ajlkVar;
        this.b = cidaVar;
        this.c = ajliVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cicz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        fctl.b(obj);
        ajlk ajlkVar = this.a;
        ConversationId conversationIdD = ajlkVar.d();
        conversationIdD.getClass();
        final ConversationIdType conversationIdTypeA = ajwb.a(conversationIdD);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.BUGLE_COMPOSE_DISABLED_EVENT, ellgVar);
        ewxc ewxcVar = (ewxc) ewxe.a.createBuilder();
        ewxcVar.getClass();
        ajli ajliVar = this.c;
        switch (ajliVar) {
            case NONE:
                i = 2;
                break;
            case CONVERSATION_UNKNOWN:
                i = 3;
                break;
            case GROUP_EMPTY:
                i = 4;
                break;
            case GROUP_TOO_LARGE:
                i = 5;
                break;
            case GROUP_NOT_A_MEMBER:
                i = 6;
                break;
            case RECIPIENT_INCOMING_ONLY:
                i = 7;
                break;
            case SELFIDENTITY_UNAVAILABLE:
                i = 8;
                break;
            case RCS_DISCONNECTED:
                i = 9;
                break;
            case RCS_UNSUPPORTED_BY_CARRIER:
                i = 10;
                break;
            case CONVERSATION_ENDED:
                i = 11;
                break;
            case NOT_DEFAULT_SMS_APP:
                i = 12;
                break;
            case GROUP_NO_SELF_NUMBER:
                i = 13;
                break;
            case PARENTAL_APPROVAL_REQUIRED:
                i = 14;
                break;
            case RCS_GROUP_CREATION_IN_PROGRESS:
                i = 15;
                break;
            case GROUP_UNSUPPORTED_BY_MANUAL_SATELLITE:
                i = 16;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(ajliVar.toString()));
        }
        ewxcVar.copyOnWrite();
        ewxe ewxeVar = (ewxe) ewxcVar.instance;
        ewxeVar.c = i - 1;
        ewxeVar.b |= 1;
        int iA = ajlkVar instanceof ajts ? cida.a(Integer.valueOf(((ajts) ajlkVar).A())) : cida.a((Integer) botm.j(barn.b(ajlkVar.d().b()), new Function() { // from class: cicv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Integer.valueOf(((bojh) obj2).k());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        cida cidaVar = this.b;
        ewxcVar.copyOnWrite();
        ewxe ewxeVar2 = (ewxe) ewxcVar.instance;
        ewxeVar2.d = iA - 1;
        ewxeVar2.b |= 2;
        if (((aqpc) cidaVar.b.b()).a()) {
            long jA = ((aika) cidaVar.d.b()).a(ajlkVar.d());
            ewxcVar.copyOnWrite();
            ewxe ewxeVar3 = (ewxe) ewxcVar.instance;
            ewxeVar3.b |= 32;
            ewxeVar3.h = jA;
        }
        ewxcVar.copyOnWrite();
        ewxe ewxeVar4 = (ewxe) ewxcVar.instance;
        ewxeVar4.e = 2;
        ewxeVar4.b |= 4;
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("getParticipantsCountFromConversationParticipantsTable");
        bsboVarE.h(new Function() { // from class: cicy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsbx bsbxVar = (bsbx) obj2;
                bsbxVar.getClass();
                boca bocaVarA = bocg.a();
                bocaVarA.c((bobk) new Function() { // from class: cict
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        bobj bobjVar = (bobj) obj3;
                        bobjVar.getClass();
                        return bobjVar.c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(bocg.c));
                final ConversationIdType conversationIdType = conversationIdTypeA;
                bocaVarA.d(new Function() { // from class: cicu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        bocf bocfVar = (bocf) obj3;
                        bocfVar.getClass();
                        bocfVar.b(conversationIdType);
                        return bocfVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(bocaVarA.b());
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iH = bsboVarE.b().h();
        ewxcVar.copyOnWrite();
        ewxe ewxeVar5 = (ewxe) ewxcVar.instance;
        ewxeVar5.b = 8 | ewxeVar5.b;
        ewxeVar5.f = iH;
        bsbo bsboVarE2 = ParticipantsTable.e();
        bsboVarE2.A("getParticipantsCountFromConversationToParticipantsTable");
        bsboVarE2.h(new Function() { // from class: cics
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsbx bsbxVar = (bsbx) obj2;
                bsbxVar.getClass();
                String[] strArr = boiv.a;
                boiq boiqVar = new boiq(boiv.a);
                boiqVar.e(new Function() { // from class: cicw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        boic boicVar = (boic) obj3;
                        boicVar.getClass();
                        return boicVar.b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final ConversationIdType conversationIdType = conversationIdTypeA;
                boiqVar.f(new Function() { // from class: cicx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        boiu boiuVar = (boiu) obj3;
                        boiuVar.getClass();
                        boiuVar.b(conversationIdType);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(boiqVar.b());
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iH2 = bsboVarE2.b().h();
        ewxcVar.copyOnWrite();
        ewxe ewxeVar6 = (ewxe) ewxcVar.instance;
        ewxeVar6.b |= 16;
        ewxeVar6.g = iH2;
        evsn evsnVarBuild = ewxcVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cn = (ewxe) evsnVarBuild;
        ellhVar.h |= 16777216;
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ((aimb) cidaVar.a.b()).a().j((ellg) builder, aioj.LOG_SPEC_DSDR_GROUP_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cicz(this.a, this.b, this.c, fcxyVar);
    }
}
