package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnr extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dnkk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnnr(dnkk dnkkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnkkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnnr) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String str;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            str = (String) this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            String str2 = (String) this.b;
            dnkk dnkkVar = this.c;
            this.b = str2;
            this.a = 1;
            Object objE = dnkkVar.e(str2, this);
            if (objE == fcylVar) {
                return fcylVar;
            }
            str = str2;
            obj = objE;
        }
        dnmj dnmjVar = (dnmj) obj;
        if (dnmjVar != null) {
            return dnmjVar;
        }
        dnmh dnmhVar = new dnmh(new dnjr(str));
        ((ekrd) ekrg.c("com/google/android/libraries/compose/emoji/data/usage/EmojiUsageModule$emojiDescriptor$2").i().h("com/google/android/libraries/compose/emoji/data/usage/EmojiUsageModule$emojiDescriptor$2", "invokeSuspend", 36, "EmojiUsageModule.kt")).D("Couldn't lookup '%s', returning fallback %s", str, dnmhVar);
        return dnmhVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnnr dnnrVar = new dnnr(this.c, fcxyVar);
        dnnrVar.b = obj;
        return dnnrVar;
    }
}
