package defpackage;

import android.text.Spanned;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xdy extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ String e;
    final /* synthetic */ xdz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdy(String str, xdz xdzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = str;
        this.f = xdzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xdy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String str;
        String str2;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            Object obj3 = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            fctl.b(obj);
            str = obj3;
            obj2 = obj4;
            str2 = obj5;
        } else {
            fctl.b(obj);
            String str3 = this.e;
            final String str4 = str3.length() == 0 ? null : str3;
            final fdce fdceVar = new fdce();
            final xdz xdzVar = this.f;
            String str5 = xdzVar.d.a(new fdap() { // from class: xdv
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    vvw vvwVar = (vvw) obj6;
                    final xdz xdzVar2 = xdzVar;
                    final fdap fdapVar = new fdap() { // from class: xdw
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj7) {
                            dnih dnihVar = xdzVar2.n;
                            dnihVar.getClass();
                            CharSequence charSequenceB = dnihVar.b(true);
                            if (true != (charSequenceB instanceof Spanned)) {
                                charSequenceB = null;
                            }
                            Spanned spanned = charSequenceB != null ? (Spanned) charSequenceB : null;
                            if (spanned != null) {
                                return wwa.a(spanned);
                            }
                            return null;
                        }
                    };
                    cilq cilqVar = (cilq) xdzVar2.j.map(new Function() { // from class: xdx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj7) {
                            return fdapVar.invoke(obj7);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null);
                    String str6 = vvwVar.a;
                    String str7 = str4;
                    boolean zF = fdbq.f(str6, str7);
                    fdce fdceVar2 = fdceVar;
                    if (zF && fdbq.f(cilqVar, vvwVar.j)) {
                        fdceVar2.a = false;
                        return vvwVar;
                    }
                    vvw vvwVarC = vvw.c(vvwVar, str7, null, null, false, null, null, false, 1, cilqVar, 766);
                    fdceVar2.a = true;
                    return vvwVarC;
                }
            }).a;
            if (fdceVar.a) {
                fdue fdueVar = xdzVar.l;
                Integer num = new Integer(xdzVar.k.get());
                this.a = str4;
                this.b = fdceVar;
                this.c = str5;
                this.d = 1;
                if (fdueVar.fO(num, this) == fcylVar) {
                    return fcylVar;
                }
            }
            str = str5;
            obj2 = fdceVar;
            str2 = str4;
        }
        if (str2 == null || str == null) {
            ekrw ekrwVarH = xdz.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$1", "invokeSuspend", 155, "DraftTextUiAdapterImpl.kt")).I("Draft text field onTextChanged, updated %b, with old and/or incoming empty: %s, %s", Boolean.valueOf(((fdce) obj2).a), str != null ? cqcy.b(str) : null, str2 != null ? cqcy.b(str2) : null);
        } else {
            fdce fdceVar2 = (fdce) obj2;
            if (fdceVar2.a) {
                ekrw ekrwVarF = xdz.a.f();
                ekrwVarF.X(eksq.a, "BugleComposeRow2");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarF).f(String.valueOf(fdceVar2.a));
                ekrdVar.V(5, TimeUnit.SECONDS);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$1", "invokeSuspend", 166, "DraftTextUiAdapterImpl.kt")).G("Draft text field onTextChanged, updated %b, incoming %s, ", fdceVar2.a, cqcy.b(this.e));
            }
        }
        if (((Boolean) crbf.aO.e()).booleanValue()) {
            Optional optional = this.f.e;
            if (optional.isPresent() && ((val) optional.get()).o()) {
                ((val) optional.get()).n(this.e);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xdy(this.e, this.f, fcxyVar);
    }
}
