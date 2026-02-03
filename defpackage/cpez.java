package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpez {
    public static final cqce a = cqce.g("BugleAnnotation", "MessageAnnotationUtils");
    public static final cczu b = cdag.r(cdag.b, "otp_message_annotations_grammar", new ejxr() { // from class: cpet
        @Override // defpackage.ejxr
        public final Object get() {
            cqce cqceVar = cpez.a;
            ejgo ejgoVar = (ejgo) ejgp.a.createBuilder();
            ejgr ejgrVar = ejgr.a;
            ejgq ejgqVar = (ejgq) ejgrVar.createBuilder();
            ejgqVar.copyOnWrite();
            ((ejgr) ejgqVar.instance).b = "(?i)((otp|sms|secret|safepass|unique\\s+id|secure|security|authorization|authentication|access|login|verification|confirmation|check|password\\s+reset|one-time|identification|activation|registration|validation)\\s+){1,3}code(\\s+(for(\\s+[^\\s]+){1,3}|you\\s+requested))?(\\s+is:?|:)?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\s|\\.|,)";
            ejgqVar.copyOnWrite();
            ((ejgr) ejgqVar.instance).c = 8;
            ejgqVar.copyOnWrite();
            ((ejgr) ejgqVar.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar);
            ejgq ejgqVar2 = (ejgq) ejgrVar.createBuilder();
            ejgqVar2.copyOnWrite();
            ((ejgr) ejgqVar2.instance).b = "(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)(\\s+is\\s+your)?(\\s+facebook|\\s+messenger){0,2}(\\s+[^\\s]+){0,2}(\\s+(otp|sms|secret|safepass|unique\\s+id|secure|security|authorization|authentication|access|login|verification|confirmation|check|password\\s+reset|one-time|identification|activation|registration|validation)){1,3}\\s+code";
            ejgqVar2.copyOnWrite();
            ((ejgr) ejgqVar2.instance).c = 2;
            ejgqVar2.copyOnWrite();
            ((ejgr) ejgqVar2.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar2);
            ejgq ejgqVar3 = (ejgq) ejgrVar.createBuilder();
            ejgqVar3.copyOnWrite();
            ((ejgr) ejgqVar3.instance).b = "^(?i)([^\\s]+\\s+)?your\\s+([^\\s]+\\s+){0,2}code(\\s+is:?|:)\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\s|\\.)";
            ejgqVar3.copyOnWrite();
            ((ejgr) ejgqVar3.instance).c = 5;
            ejgqVar3.copyOnWrite();
            ((ejgr) ejgqVar3.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar3);
            ejgq ejgqVar4 = (ejgq) ejgrVar.createBuilder();
            ejgqVar4.copyOnWrite();
            ((ejgr) ejgqVar4.instance).b = "^(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)\\s+is\\s+your\\s+([^\\s]+\\s+)?code(\\.|\\s+for|\\s+to)";
            ejgqVar4.copyOnWrite();
            ((ejgr) ejgqVar4.instance).c = 2;
            ejgqVar4.copyOnWrite();
            ((ejgr) ejgqVar4.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar4);
            ejgq ejgqVar5 = (ejgq) ejgrVar.createBuilder();
            ejgqVar5.copyOnWrite();
            ((ejgr) ejgqVar5.instance).b = "(?i)(enter|use)\\s+(the\\s+|this\\s+)?([^\\s]+\\s+)?code:?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)\\s+to\\s+(confirm|verify)";
            ejgqVar5.copyOnWrite();
            ((ejgr) ejgqVar5.instance).c = 5;
            ejgqVar5.copyOnWrite();
            ((ejgr) ejgqVar5.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar5);
            ejgq ejgqVar6 = (ejgq) ejgrVar.createBuilder();
            ejgqVar6.copyOnWrite();
            ((ejgr) ejgqVar6.instance).b = "^(?i)([^\\s]+\\s+)?code(\\s+is:?|:)?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\.|\\s)$";
            ejgqVar6.copyOnWrite();
            ((ejgr) ejgqVar6.instance).c = 4;
            ejgqVar6.copyOnWrite();
            ((ejgr) ejgqVar6.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar6);
            ejgq ejgqVar7 = (ejgq) ejgrVar.createBuilder();
            ejgqVar7.copyOnWrite();
            ((ejgr) ejgqVar7.instance).b = "^(?i)use\\s+(?-i)([A-Z0-9]{4,})(?i)\\s+as(\\s+your)?(\\s+microsoft\\s+account|\\s+instagram)(\\s+[^\\s]+){0,2}\\s+code";
            ejgqVar7.copyOnWrite();
            ((ejgr) ejgqVar7.instance).c = 1;
            ejgqVar7.copyOnWrite();
            ((ejgr) ejgqVar7.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar7);
            ejgq ejgqVar8 = (ejgq) ejgrVar.createBuilder();
            ejgqVar8.copyOnWrite();
            ((ejgr) ejgqVar8.instance).b = "^(?i)snapchat\\s+code:\\s+(?-i)([A-Z0-9]{4,})\\.";
            ejgqVar8.copyOnWrite();
            ((ejgr) ejgqVar8.instance).c = 1;
            ejgqVar8.copyOnWrite();
            ((ejgr) ejgqVar8.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar8);
            ejgq ejgqVar9 = (ejgq) ejgrVar.createBuilder();
            ejgqVar9.copyOnWrite();
            ((ejgr) ejgqVar9.instance).b = "^(?i)enter\\s+this\\s+code\\s+to\\s+reset\\s+your\\s+twitter\\s+password:\\s+(?-i)([A-Z0-9]{4,})\\.?";
            ejgqVar9.copyOnWrite();
            ((ejgr) ejgqVar9.instance).c = 1;
            ejgqVar9.copyOnWrite();
            ((ejgr) ejgqVar9.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            ejgoVar.a(ejgqVar9);
            return ((ejgp) ejgoVar.build()).toByteArray();
        }
    });
    public final eygg c;
    public final cqyy d;
    public final fcsu e;
    public final fcsu f;
    public final cpfg g = new cpfg();
    public final cqyy h;
    public final eosc i;
    public final eosc j;
    public final fcsu k;
    private final Context l;
    private final fcsu m;
    private final cpen n;
    private final fcsu o;
    private final fcsu p;

    public cpez(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eygg eyggVar, fcsu fcsuVar4, cqyy cqyyVar, cqyy cqyyVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.l = context;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.m = fcsuVar3;
        this.c = eyggVar;
        this.o = fcsuVar4;
        this.n = new cpen(eoscVar2, this);
        this.d = cqyyVar;
        this.h = cqyyVar2;
        this.i = eoscVar;
        this.j = eoscVar2;
        this.k = fcsuVar5;
        this.p = fcsuVar6;
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezds ezdsVar = (ezds) it.next();
            eyzy eyzyVarB = eyzy.b(ezdsVar.e);
            if (eyzyVarB == null) {
                eyzyVarB = eyzy.UNRECOGNIZED;
            }
            if (eyzyVarB == eyzy.ADDRESS_ANNOTATION && ezdsVar.c == 7) {
                return true;
            }
        }
        return false;
    }

    public static boolean i() {
        return ((Boolean) crao.i.e()).booleanValue();
    }

    public static boolean j() {
        return ((Boolean) crao.b.e()).booleanValue() || k() || ((Boolean) crao.d.e()).booleanValue() || ((Boolean) crao.f.e()).booleanValue() || ((Boolean) crao.g.e()).booleanValue() || ((Boolean) crao.h.e()).booleanValue();
    }

    private static boolean k() {
        return ((Boolean) crao.c.e()).booleanValue();
    }

    public final eiju a(String str, final MessageIdType messageIdType, final eyzv eyzvVar) {
        if (TextUtils.isEmpty(str)) {
            return eijx.d(new IllegalArgumentException("otpCode id is null"));
        }
        cssw csswVar = (cssw) this.o.b();
        if (csswVar != null) {
            csswVar.a(str, this.l.getString(R.string.otp_copied_to_clipboard));
        }
        if (!messageIdType.c()) {
            return eijx.g(new Callable() { // from class: cpes
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cpez cpezVar = this.a;
                    MessageIdType messageIdType2 = messageIdType;
                    eyzv eyzvVar2 = eyzvVar;
                    try {
                        MessageCoreData messageCoreDataW = ((baxe) cpezVar.f.b()).w(messageIdType2);
                        if (messageCoreDataW == null) {
                            cqbd cqbdVarE = cpez.a.e();
                            cqbdVarE.I("Couldn't read message when trying to copy otp code.");
                            cqbdVarE.d(messageIdType2);
                            cqbdVarE.r();
                        } else {
                            eltl eltlVar = (eltl) eltm.a.createBuilder();
                            eltlVar.copyOnWrite();
                            eltm eltmVar = (eltm) eltlVar.instance;
                            eltmVar.d = eyzvVar2.a();
                            eltmVar.b |= 2;
                            eltlVar.copyOnWrite();
                            eltm eltmVar2 = (eltm) eltlVar.instance;
                            eltmVar2.c = 1;
                            eltmVar2.b = 1 | eltmVar2.b;
                            ((ajhd) cpezVar.k.b()).O(messageCoreDataW, (eltm) eltlVar.build());
                        }
                        return null;
                    } catch (Exception e) {
                        cqbd cqbdVarB = cpez.a.b();
                        cqbdVarB.I("Couldn't log otp copy.");
                        cqbdVarB.d(messageIdType2);
                        cqbdVarB.A("actionSource", eyzvVar2);
                        cqbdVarB.s(e);
                        return null;
                    }
                }
            }, this.i);
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("No message id passed");
        cqbdVarE.M("OTP code", str);
        cqbdVarE.r();
        return eijx.d(new IllegalArgumentException("Message id is null"));
    }

    public final eiju b(String str) {
        return !k() ? eijx.e(null) : this.d.a(str).h(new ejvr() { // from class: cpeq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cpez.a;
                for (ezds ezdsVar : (List) obj) {
                    if (ezdsVar.c == 7) {
                        return ezdsVar;
                    }
                }
                return null;
            }
        }, this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju c(final java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto La4
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Lb
            goto La4
        Lb:
            boolean r1 = defpackage.csss.b(r11)
            if (r1 != 0) goto L16
            eiju r11 = defpackage.eijx.e(r0)
            return r11
        L16:
            cpen r0 = r10.n
            android.net.Uri r1 = android.net.Uri.parse(r11)
            ezbd r2 = defpackage.ezbd.a
            evsf r2 = r2.createBuilder()
            ezbc r2 = (defpackage.ezbc) r2
            java.lang.String r3 = r1.getPath()
            r4 = 0
            if (r3 == 0) goto L7e
            java.util.regex.Pattern r5 = defpackage.cpen.b
            java.util.regex.Matcher r5 = r5.matcher(r3)
            boolean r6 = r5.find()
            java.lang.String r7 = ""
            java.lang.String r8 = "UTF-8"
            r9 = 1
            if (r6 == 0) goto L4c
            java.lang.String r5 = r5.group(r9)     // Catch: java.io.UnsupportedEncodingException -> L4c
            if (r5 != 0) goto L43
            r5 = r7
        L43:
            java.lang.String r5 = j$.net.URLDecoder.decode(r5, r8)     // Catch: java.io.UnsupportedEncodingException -> L4c
            boolean r5 = defpackage.cpen.c(r5, r2)     // Catch: java.io.UnsupportedEncodingException -> L4c
            goto L4d
        L4c:
            r5 = r4
        L4d:
            java.util.regex.Pattern r6 = defpackage.cpen.a
            java.util.regex.Matcher r3 = r6.matcher(r3)
            boolean r6 = r3.find()
            if (r6 == 0) goto L75
            java.lang.String r3 = r3.group(r9)     // Catch: java.io.UnsupportedEncodingException -> L7e
            if (r3 != 0) goto L60
            goto L61
        L60:
            r7 = r3
        L61:
            java.lang.String r3 = j$.net.URLDecoder.decode(r7, r8)     // Catch: java.io.UnsupportedEncodingException -> L7e
            eiju r3 = r0.a(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> L7e
            cpei r6 = new cpei     // Catch: java.io.UnsupportedEncodingException -> L7e
            r6.<init>()     // Catch: java.io.UnsupportedEncodingException -> L7e
            eosc r5 = r0.d     // Catch: java.io.UnsupportedEncodingException -> L7e
            eiju r3 = r3.h(r6, r5)     // Catch: java.io.UnsupportedEncodingException -> L7e
            goto L86
        L75:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            eiju r3 = defpackage.eijx.e(r3)
            goto L86
        L7e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            eiju r3 = defpackage.eijx.e(r3)
        L86:
            cpej r4 = new cpej
            r4.<init>()
            eosc r0 = r0.d
            eiju r3 = r3.i(r4, r0)
            cpek r4 = new cpek
            r4.<init>()
            eiju r1 = r3.h(r4, r0)
            cpel r3 = new cpel
            r3.<init>()
            eiju r11 = r1.h(r3, r0)
            return r11
        La4:
            eiju r11 = defpackage.eijx.e(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpez.c(java.lang.String):eiju");
    }

    public final elij d(MessageCoreData messageCoreData, String str, eyzy eyzyVar) {
        ParticipantsTable.BindData bindDataB = ((bbca) this.m.b()).b(messageCoreData.aB());
        elih elihVar = (elih) elij.a.createBuilder();
        int iQ = bindDataB != null ? bbbd.q(bindDataB) : 1;
        elihVar.copyOnWrite();
        elij elijVar = (elij) elihVar.instance;
        elijVar.d = iQ - 1;
        elijVar.b |= 2;
        boolean z = false;
        if (bindDataB != null && TextUtils.isEmpty(bindDataB.S())) {
            z = true;
        }
        elihVar.copyOnWrite();
        elij elijVar2 = (elij) elihVar.instance;
        elijVar2.b |= 4;
        elijVar2.e = z;
        elihVar.copyOnWrite();
        elij elijVar3 = (elij) elihVar.instance;
        elijVar3.c = eyzyVar.a();
        elijVar3.b |= 1;
        elihVar.copyOnWrite();
        elij elijVar4 = (elij) elihVar.instance;
        elijVar4.b |= 64;
        elijVar4.h = str;
        return (elij) elihVar.build();
    }

    public final void e(SuggestionData suggestionData, eyzv eyzvVar) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            ezgi ezgiVar = ((SmartSuggestionItemSuggestionData) suggestionData).c;
            String str = (ezgiVar.c == 18 ? (ezei) ezgiVar.d : ezei.a).b;
            ezgg ezggVar = ezgiVar.e;
            if (ezggVar == null) {
                ezggVar = ezgg.b;
            }
            MessageIdType messageIdTypeB = bary.b(ezggVar.m);
            ezgg ezggVar2 = ezgiVar.e;
            if (ezggVar2 == null) {
                ezggVar2 = ezgg.b;
            }
            ConversationIdType conversationIdTypeB = barn.b(ezggVar2.n);
            eika.l(a(str, messageIdTypeB, eyzvVar), auwc.a(new cpey()), this.i);
            if (conversationIdTypeB.b()) {
                return;
            }
            ((aypj) this.p.b()).e(conversationIdTypeB);
        }
    }

    public final void f(MessageCoreData messageCoreData) {
        ezds ezdsVarB;
        if (h() && (ezdsVarB = ((cpfc) this.c.b()).b(messageCoreData, true)) != null) {
            ((cqyx) this.e.b()).b(messageCoreData.A(), messageCoreData.C(), ekgb.r(ezdsVarB));
        }
    }

    public final boolean h() {
        return ((cpfc) this.c.b()).c((byte[]) b.e());
    }
}
