package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amil implements amwe {
    final /* synthetic */ ezds a;
    final /* synthetic */ amim b;
    final /* synthetic */ andw c;

    public amil(ezds ezdsVar, amim amimVar, andw andwVar) {
        this.a = ezdsVar;
        this.b = amimVar;
        this.c = andwVar;
    }

    @Override // defpackage.amwe
    public final int a() {
        return this.a.i;
    }

    @Override // defpackage.amwe
    public final int b() {
        return this.a.h;
    }

    @Override // defpackage.amwe
    public final amwd c() {
        ezds ezdsVar = this.a;
        eyzy eyzyVarB = eyzy.b(ezdsVar.e);
        if (eyzyVarB == null) {
            eyzyVarB = eyzy.UNRECOGNIZED;
        }
        switch (eyzyVarB) {
            case UNSPECIFIED:
                return amwd.UNSPECIFIED;
            case OTP:
                return amwd.OTP;
            case LINK_ANNOTATION:
                return amwd.LINK;
            case LINK_PREVIEW_ANNOTATION:
                return amwd.LINK;
            case ASSISTANT_ANNOTATION:
                return amwd.ASSISTANT;
            case CONTACT_ANNOTATION:
                return amwd.CONTACT;
            case ADDRESS_ANNOTATION:
                return amwd.ADDRESS;
            case WEBREF_ANNOTATION:
                return amwd.LINK;
            case SIMPLE_ANNOTATION:
                return amwd.UNSPECIFIED;
            case MONEY_ANNOTATION:
                return amwd.MONEY;
            case DATETIME_ANNOTATION:
                return amwd.DATE;
            case TIMELIKE:
                return amwd.UNSPECIFIED;
            case NUDGE_ANNOTATION:
                return amwd.NUDGE;
            case YOUTUBE_ANNOTATION:
                return amwd.LINK;
            case MAP_LINK_ANNOTATION:
                return amwd.LINK;
            case EMAIL_ANNOTATION:
                return amwd.EMAIL;
            case PHONE_ANNOTATION:
                return amwd.PHONE;
            case UX_COMPONENT_ANNOTATION:
                if (eyvv.b(ezdsVar) != null) {
                    return amwd.LINK;
                }
                if (eyvv.a(ezdsVar) != null) {
                    return amwd.IMAGE;
                }
                if (eyvv.c(ezdsVar) != null) {
                    return amwd.ORIGINAL_TEXT;
                }
                int iB = ezas.b(ezdsVar.g);
                if (iB == 0) {
                    iB = 1;
                }
                switch (iB - 2) {
                    case 4:
                        return amwd.BOLD;
                    case 5:
                        return amwd.ITALICS;
                    case 6:
                        return amwd.STRIKETHROUGH;
                    case 7:
                        return amwd.MONOSPACE;
                    case 8:
                    case 11:
                    case 12:
                    default:
                        return amwd.UNSPECIFIED;
                    case 9:
                        return amwd.BULLET;
                    case 10:
                        return amwd.HEADER;
                    case 13:
                        return amwd.CODE_BLOCK;
                    case 14:
                        return amwd.ORDERED_LIST_ITEM;
                    case 15:
                        return amwd.TABLE_HEAD;
                    case 16:
                        return amwd.TABLE_BODY;
                    case 17:
                        return amwd.TABLE_ROW;
                    case 18:
                        return amwd.TABLE_CELL;
                    case 19:
                        return ((ardm) this.b.b.b()).a() ? amwd.MENTION : amwd.UNSPECIFIED;
                }
            case UNRECOGNIZED:
                return amwd.UNSPECIFIED;
            default:
                throw new fctg();
        }
    }

    @Override // defpackage.amwe
    public final ResolvedRecipient d() {
        amim amimVar = this.b;
        if (((ardm) amimVar.b.b()).a()) {
            ezds ezdsVar = this.a;
            if (ezdsVar.c == 23) {
                String str = ((ezdq) ezdsVar.d).b;
                str.getClass();
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    return this.c.b(((alrj) amimVar.a.b()).n(str));
                }
            }
        }
        return null;
    }

    @Override // defpackage.amwe
    public final String e() {
        ezdo ezdoVarC = eyvv.c(this.a);
        if (ezdoVarC != null) {
            return ezdoVarC.b;
        }
        return null;
    }

    @Override // defpackage.amwe
    public final String f() {
        ezds ezdsVar = this.a;
        if (eyvv.b(ezdsVar) != null) {
            return (ezdsVar.c == 8 ? (ezdk) ezdsVar.d : ezdk.a).c;
        }
        if (eyvv.a(ezdsVar) != null) {
            return (ezdsVar.c == 21 ? (ezde) ezdsVar.d : ezde.a).b;
        }
        return null;
    }

    @Override // defpackage.amwe
    public final int g() {
        int iB;
        ezds ezdsVar = this.a;
        eyzy eyzyVarB = eyzy.b(ezdsVar.e);
        if (eyzyVarB == null) {
            eyzyVarB = eyzy.UNRECOGNIZED;
        }
        switch (eyzyVarB) {
            case UNSPECIFIED:
                return 1;
            case OTP:
            case LINK_ANNOTATION:
            case LINK_PREVIEW_ANNOTATION:
            case ASSISTANT_ANNOTATION:
            case CONTACT_ANNOTATION:
            case ADDRESS_ANNOTATION:
            case WEBREF_ANNOTATION:
            case SIMPLE_ANNOTATION:
            case MONEY_ANNOTATION:
            case DATETIME_ANNOTATION:
            case TIMELIKE:
            case NUDGE_ANNOTATION:
            case YOUTUBE_ANNOTATION:
            case MAP_LINK_ANNOTATION:
            case EMAIL_ANNOTATION:
            case PHONE_ANNOTATION:
                return 2;
            case UX_COMPONENT_ANNOTATION:
                return (((ardm) this.b.b.b()).a() && (iB = ezas.b(ezdsVar.g)) != 0 && iB == 21) ? 4 : 3;
            case UNRECOGNIZED:
                return 1;
            default:
                throw new fctg();
        }
    }
}
