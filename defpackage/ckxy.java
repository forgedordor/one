package defpackage;

import android.util.Patterns;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxy {
    public static final ekgb a(final ConversationIdType conversationIdType, String str, int i) throws IOException {
        str.getClass();
        eieu eieuVarA = eiiy.a("ReactedMessageMatcher#findMatchingMessages");
        try {
            List listB = b(c(bjdl.b(conversationIdType, i).b()), str);
            if (listB.isEmpty()) {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.y(i);
                brdrVarD.f(new Function() { // from class: ckxw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bran) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.h(new Function() { // from class: ckxx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.m(conversationIdType);
                        brecVar.A(true);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bran branVar = MessagesTable.c;
                brdrVarD.d(new brdo(branVar.i, false), new brdo(branVar.a, false));
                listB = fcva.an(b(c(brdrVarD.b()), str), 1);
            }
            fczl.a(eieuVarA, null);
            if (listB.size() == 1 || (listB.size() > 1 && ((ckxt) fcva.S(listB)).a - ((ckxt) listB.get(listB.size() - 2)).a >= ((Number) ckmx.d.e()).intValue())) {
                ekgb ekgbVarR = ekgb.r(((ckxt) fcva.S(listB)).b);
                ekgbVarR.getClass();
                return ekgbVarR;
            }
            ArrayList arrayList = new ArrayList(fcva.p(listB, 10));
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((ckxt) it.next()).b);
            }
            return ekfv.a(arrayList);
        } finally {
        }
    }

    private static final List b(List list, String str) {
        CharSequence charSequenceSubSequence;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (fdbq.f(((ckxt) obj).c, str)) {
                arrayList.add(obj);
            }
        }
        char[] cArr = {8230};
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (str.charAt(length) != cArr[0]) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        String string = charSequenceSubSequence.toString();
        if (arrayList.isEmpty() && Patterns.WEB_URL.matcher(string).matches()) {
            String strD = fdgn.D(string, "http://", string);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (fdbq.f(((ckxt) obj2).c, strD)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                String str2 = ((ckxt) obj3).c;
                if (str2 != null && (fdgn.t(str2, string) || fdgn.n(str2, string) || fdgn.n(str2, str))) {
                    arrayList.add(obj3);
                }
            }
        }
        if (!eotp.a("bugle.fix_xms_reaction_matching_with_line_breaks", "bugle") || !arrayList.isEmpty()) {
            return arrayList;
        }
        fdap fdapVar = new fdap() { // from class: ckxu
            @Override // defpackage.fdap
            public final Object invoke(Object obj4) {
                String str3 = (String) obj4;
                if (str3 != null) {
                    return new fdgl("\\R").b(str3, "\n");
                }
                return null;
            }
        };
        Object objInvoke = fdapVar.invoke(string);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list) {
            if (fdbq.f(fdapVar.invoke(((ckxt) obj4).c), objInvoke)) {
                arrayList3.add(obj4);
            }
        }
        return arrayList3;
    }

    private static final List c(final dqxe dqxeVar) {
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("findMatchingMessages");
        bsjeVarC.h(new Function() { // from class: ckxv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsjl bsjlVar = (bsjl) obj;
                bsjlVar.o(dqxeVar);
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = 0;
        bsjeVarC.d(new bsjb(PartsTable.d.k, true));
        ekgb ekgbVarZ = bsjeVarC.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (Object obj : ekgbVarZ) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            PartsTable.BindData bindData = (PartsTable.BindData) obj;
            MessageIdType messageIdTypeV = bindData.v();
            messageIdTypeV.getClass();
            arrayList.add(new ckxt(i, messageIdTypeV, bindData.L()));
            i = i2;
        }
        return arrayList;
    }
}
