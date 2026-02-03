package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxuy {
    public abstract int a();

    public abstract long b();

    public abstract ConversationIdType c();

    public abstract MessageIdType d();

    public abstract ezds e();

    public abstract ezds f();

    public abstract Optional g();

    public abstract Long h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract boolean q();

    public abstract boolean r();

    public final ezbd s() {
        ezds ezdsVarE = e();
        ezbd ezbdVar = null;
        if (ezdsVarE != null) {
            eyzy eyzyVarB = eyzy.b(ezdsVarE.e);
            if (eyzyVarB == null) {
                eyzyVarB = eyzy.UNRECOGNIZED;
            }
            if (eyzyVarB == eyzy.ADDRESS_ANNOTATION) {
                ejwl.l(ezdsVarE.c == 7);
                ezbdVar = ezdsVarE.c == 7 ? (ezbd) ezdsVarE.d : ezbd.a;
            }
        }
        ezdk ezdkVarT = t();
        if (ezdkVarT == null || (1 & ezdkVarT.b) == 0) {
            return ezbdVar;
        }
        if (ezbdVar == null) {
            ezbd ezbdVar2 = ezdkVarT.d;
            return ezbdVar2 == null ? ezbd.a : ezbdVar2;
        }
        ezbc ezbcVar = (ezbc) ezbdVar.toBuilder();
        ezbd ezbdVar3 = ezdkVarT.d;
        if (ezbdVar3 == null) {
            ezbdVar3 = ezbd.a;
        }
        ezbcVar.mergeFrom((ezbc) ezbdVar3);
        return (ezbd) ezbcVar.build();
    }

    public final ezdk t() {
        ezdm ezdmVar;
        String strM = m();
        String strL = l();
        String strK = k();
        if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strL) || TextUtils.isEmpty(strK)) {
            ezdmVar = null;
        } else {
            Long lH = h();
            ezdl ezdlVar = (ezdl) ezdm.a.createBuilder();
            ezdlVar.copyOnWrite();
            ezdm ezdmVar2 = (ezdm) ezdlVar.instance;
            strM.getClass();
            ezdmVar2.b = strM;
            ezdlVar.copyOnWrite();
            ezdm ezdmVar3 = (ezdm) ezdlVar.instance;
            strL.getClass();
            ezdmVar3.d = strL;
            ezdlVar.copyOnWrite();
            ezdm ezdmVar4 = (ezdm) ezdlVar.instance;
            strK.getClass();
            ezdmVar4.c = strK;
            long jLongValue = lH != null ? lH.longValue() : 0L;
            ezdlVar.copyOnWrite();
            ((ezdm) ezdlVar.instance).e = jLongValue;
            ezdmVar = (ezdm) ezdlVar.build();
        }
        ezds ezdsVarF = f();
        if (ezdsVarF != null) {
            eyzy eyzyVarB = eyzy.b(ezdsVarF.e);
            if (eyzyVarB == null) {
                eyzyVarB = eyzy.UNRECOGNIZED;
            }
            if (eyzyVarB == eyzy.LINK_ANNOTATION) {
                ejwl.l(ezdsVarF.c == 8);
                ezdk ezdkVar = ezdsVarF.c == 8 ? (ezdk) ezdsVarF.d : ezdk.a;
                if ((ezdkVar.b & 2) != 0 || ezdmVar == null) {
                    return ezdkVar;
                }
                ezdj ezdjVar = (ezdj) ezdkVar.toBuilder();
                ezdjVar.copyOnWrite();
                ezdk ezdkVar2 = (ezdk) ezdjVar.instance;
                ezdkVar2.e = ezdmVar;
                ezdkVar2.b |= 2;
                return (ezdk) ezdjVar.build();
            }
        }
        if (ezdmVar == null) {
            return null;
        }
        ezdj ezdjVar2 = (ezdj) ezdk.a.createBuilder();
        String strN = n();
        strN.getClass();
        ezdjVar2.copyOnWrite();
        ((ezdk) ezdjVar2.instance).c = strN;
        ezdjVar2.copyOnWrite();
        ezdk ezdkVar3 = (ezdk) ezdjVar2.instance;
        ezdkVar3.e = ezdmVar;
        ezdkVar3.b |= 2;
        return (ezdk) ezdjVar2.build();
    }

    public final ezdm u() {
        ezdk ezdkVarT = t();
        if (ezdkVarT == null || (ezdkVarT.b & 2) == 0) {
            return null;
        }
        ezdm ezdmVar = ezdkVarT.e;
        return ezdmVar == null ? ezdm.a : ezdmVar;
    }

    public final String v() {
        ezdk ezdkVarT = t();
        return (ezdkVarT == null || ezdkVarT.c.isEmpty()) ? n() : ezdkVarT.c;
    }
}
