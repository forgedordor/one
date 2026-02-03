package defpackage;

import com.google.speech.grammar.pumpkin.ActionFrame;
import com.google.speech.grammar.pumpkin.ActionFrameManager;
import com.google.speech.grammar.pumpkin.Tagger;
import com.google.speech.grammar.pumpkin.UserValidators;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejni implements ejmp {
    private static final Pattern a = Pattern.compile("(\\s|^)(?<amount>\\$\\d*(\\.\\d*)?)(\\D|$)");
    private static final Pattern b = Pattern.compile("\\b(?<hour>[012]?\\d)[:\\s]?(?<minutes>[12345]\\d)?\\b");
    private final ejnn c;
    private final Tagger d;
    private final ActionFrame e;
    private final ejng f;
    private final boolean g;

    public ejni(ejnn ejnnVar, Tagger tagger, ActionFrame actionFrame, ejng ejngVar, boolean z) {
        this.c = ejnnVar;
        this.d = tagger;
        this.e = actionFrame;
        this.f = ejngVar;
        this.g = z;
    }

    public static ejni c(ejnn ejnnVar, ejly ejlyVar, boolean z) throws IOException, ejkv {
        ejha ejhaVarA;
        try {
            ejnh ejnhVar = new ejnh(ejnnVar, ejlyVar);
            ejnhVar.b();
            Tagger tagger = ejnhVar.d;
            exwm exwmVar = ejnnVar.d;
            if (exwmVar == null) {
                exwmVar = exwm.a;
            }
            exwl exwlVar = (exwl) exwm.a.createBuilder();
            for (exwk exwkVar : exwmVar.b) {
                ejnn ejnnVar2 = ejnhVar.b;
                if ((ejnnVar2.b & 4) != 0) {
                    ejhaVarA = ejnhVar.a.a(a.q(ejnnVar2.f, exwkVar.c, ":"));
                } else {
                    if (!DesugarCollections.unmodifiableMap(ejnnVar2.g).containsKey(exwkVar.c)) {
                        throw new IOException("No local file for action: ".concat(String.valueOf(exwkVar.c)));
                    }
                    ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
                    String str = (String) DesugarCollections.unmodifiableMap(ejnnVar2.g).get(exwkVar.c);
                    ejgzVar.copyOnWrite();
                    ejha ejhaVar = (ejha) ejgzVar.instance;
                    str.getClass();
                    ejhaVar.b |= 2;
                    ejhaVar.d = str;
                    ejhaVarA = (ejha) ejgzVar.build();
                }
                try {
                    InputStream inputStreamF = ejnhVar.a.f(ejhaVarA);
                    try {
                        exwj exwjVar = (exwj) exwkVar.toBuilder();
                        evqs evqsVarB = evqs.B(inputStreamF);
                        exwjVar.copyOnWrite();
                        exwk exwkVar2 = (exwk) exwjVar.instance;
                        evqsVarB.getClass();
                        exwkVar2.b |= 4;
                        exwkVar2.d = evqsVarB;
                        exwk exwkVar3 = (exwk) exwjVar.build();
                        exwlVar.copyOnWrite();
                        exwm exwmVar2 = (exwm) exwlVar.instance;
                        exwkVar3.getClass();
                        evtg evtgVar = exwmVar2.b;
                        if (!evtgVar.c()) {
                            exwmVar2.b = evsn.mutableCopy(evtgVar);
                        }
                        exwmVar2.b.add(exwkVar3);
                        if (inputStreamF != null) {
                            inputStreamF.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamF == null) {
                            throw th;
                        }
                        try {
                            inputStreamF.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    throw new IOException(e);
                }
            }
            exwm exwmVar3 = (exwm) exwlVar.build();
            long jNativeLoadActionFrame = ActionFrameManager.nativeLoadActionFrame(ejnhVar.c.a, exwmVar3.toByteArray());
            if (jNativeLoadActionFrame == 0) {
                throw new IllegalArgumentException("Couldn't create action_frame from the provided ActionSetConfig");
            }
            ActionFrame actionFrame = new ActionFrame(jNativeLoadActionFrame);
            evtg<ejnk> evtgVar2 = ejnnVar.e;
            Pattern pattern = ejng.a;
            ekhv ekhvVar = new ekhv();
            ekhy ekhyVar = new ekhy();
            for (ejnk ejnkVar : evtgVar2) {
                String str2 = ejnkVar.b;
                ekhvVar.c(str2);
                Iterator<E> it = ejnkVar.c.iterator();
                while (it.hasNext()) {
                    ekhyVar.b((String) it.next(), str2);
                }
                Iterator<E> it2 = ejnkVar.d.iterator();
                while (it2.hasNext()) {
                    ekhyVar.b((String) it2.next(), str2);
                }
            }
            ekhvVar.c("CONTACT");
            ekhvVar.c("ADDRESS");
            ekhvVar.c("MONEY");
            ekhvVar.c("ACNUMBER");
            ekhvVar.c("PERCENTAGE");
            ekhvVar.c("COUPON");
            ekhvVar.c("DATE");
            ekhvVar.c("DATE_TIME");
            ekhvVar.c("TIMELIKE");
            ekhvVar.c("TIME");
            return new ejni(ejnnVar, tagger, actionFrame, new ejng(ekhvVar.g(), ekhyVar.a()), z);
        } catch (Exception e2) {
            throw new ejkv("Could not initialize Pumpkin model!", e2);
        }
    }

    static String d(String str) {
        return str.isEmpty() ? str : str.replaceAll("[\n!?.,;:\\(\\)\\{\\}\\[\\]\"/\\-\\\\+\\\\*%@&_]", " ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ejmp
    public final ekgb a(ezdx ezdxVar, String str, ejqq ejqqVar) throws NumberFormatException {
        char c;
        exxb exxbVar;
        Iterator it;
        if (ezdxVar != null && !ezdxVar.b.isEmpty()) {
            ezdv ezdvVar = (ezdv) ezdxVar.b.get(ezdxVar.b.size() - 1);
            int i = 30;
            if (!(ezdvVar.b == 30 ? (String) ezdvVar.c : "").isEmpty()) {
                ezdv ezdvVar2 = (ezdv) ezdxVar.b.get(ezdxVar.b.size() - 1);
                ezdu ezduVar = (ezdu) ezdvVar2.toBuilder();
                String strD = d(ezdvVar2.b == 30 ? (String) ezdvVar2.c : "");
                ezduVar.copyOnWrite();
                ezdv ezdvVar3 = (ezdv) ezduVar.instance;
                strD.getClass();
                ezdvVar3.b = 30;
                ezdvVar3.c = strD;
                ezdv ezdvVar4 = (ezdv) ezduVar.build();
                String str2 = ezdvVar4.b == 30 ? (String) ezdvVar4.c : "";
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Matcher matcher = a.matcher(str2);
                while (true) {
                    c = 11;
                    if (!matcher.find()) {
                        break;
                    }
                    try {
                        String strGroup = matcher.group("amount");
                        ezeb ezebVar = (ezeb) ezec.a.createBuilder();
                        ezoq ezoqVar = (ezoq) ezor.a.createBuilder();
                        ezoqVar.copyOnWrite();
                        ((ezor) ezoqVar.instance).c = "USD";
                        double d = Double.parseDouble(strGroup.substring(1)) * 1000000.0d;
                        ezoqVar.copyOnWrite();
                        ((ezor) ezoqVar.instance).b = (long) d;
                        ezebVar.copyOnWrite();
                        ezec ezecVar = (ezec) ezebVar.instance;
                        ezor ezorVar = (ezor) ezoqVar.build();
                        ezorVar.getClass();
                        ezecVar.c = ezorVar;
                        ezecVar.b = 1 | ezecVar.b;
                        ezec ezecVar2 = (ezec) ezebVar.build();
                        ezdr ezdrVar = (ezdr) ezds.a.createBuilder();
                        ezdrVar.copyOnWrite();
                        ezds ezdsVar = (ezds) ezdrVar.instance;
                        ezecVar2.getClass();
                        ezdsVar.d = ezecVar2;
                        ezdsVar.c = 11;
                        int iStart = matcher.start(2);
                        ezdrVar.copyOnWrite();
                        ((ezds) ezdrVar.instance).h = iStart;
                        int iEnd = matcher.end(2);
                        ezdrVar.copyOnWrite();
                        ((ezds) ezdrVar.instance).i = iEnd;
                        ekfwVar.h((ezds) ezdrVar.build());
                    } catch (NumberFormatException unused) {
                    }
                }
                ekgb ekgbVarG = ekfwVar.g();
                ezdu ezduVar2 = (ezdu) ezdvVar4.toBuilder();
                ezduVar2.a(ekgbVarG);
                ezdv ezdvVar5 = (ezdv) ezduVar2.build();
                Iterator<E> it2 = ezdvVar5.f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ezds ezdsVar2 = (ezds) it2.next();
                        if (((ezdsVar2.c == 14 ? (ezcl) ezdsVar2.d : ezcl.a).b & 8) != 0) {
                            break;
                        }
                    } else {
                        String str3 = ezdvVar5.b == 30 ? (String) ezdvVar5.c : "";
                        ekfw ekfwVar2 = new ekfw();
                        Matcher matcher2 = b.matcher(str3);
                        while (matcher2.find()) {
                            String strGroup2 = matcher2.group("hour");
                            String strGroup3 = matcher2.group("minutes");
                            try {
                                ezhb ezhbVar = (ezhb) ezhc.a.createBuilder();
                                int i3 = Integer.parseInt(strGroup2);
                                ezhbVar.copyOnWrite();
                                ((ezhc) ezhbVar.instance).b = i3;
                                int i4 = (strGroup3 == null || strGroup3.isEmpty()) ? 0 : Integer.parseInt(strGroup3);
                                ezhbVar.copyOnWrite();
                                ((ezhc) ezhbVar.instance).c = i4;
                                ezhc ezhcVar = (ezhc) ezhbVar.build();
                                ezdr ezdrVar2 = (ezdr) ezds.a.createBuilder();
                                int iStart2 = matcher2.start();
                                ezdrVar2.copyOnWrite();
                                ((ezds) ezdrVar2.instance).h = iStart2;
                                int iEnd2 = matcher2.end();
                                ezdrVar2.copyOnWrite();
                                ((ezds) ezdrVar2.instance).i = iEnd2;
                                ezdrVar2.copyOnWrite();
                                ezds ezdsVar3 = (ezds) ezdrVar2.instance;
                                ezhcVar.getClass();
                                ezdsVar3.d = ezhcVar;
                                ezdsVar3.c = 15;
                                ekfwVar2.h((ezds) ezdrVar2.build());
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        ekgb ekgbVarG2 = ekfwVar2.g();
                        ezdu ezduVar3 = (ezdu) ezdvVar5.toBuilder();
                        ezduVar3.a(ekgbVarG2);
                        ezdvVar5 = (ezdv) ezduVar3.build();
                    }
                }
                ejng ejngVar = this.f;
                final ekgc ekgcVar = new ekgc();
                ekgc ekgcVar2 = new ekgc();
                for (ezds ezdsVar4 : ezdvVar5.f) {
                    final String strReplaceAll = ejng.a.matcher(d((ezdvVar5.b == i ? (String) ezdvVar5.c : "").substring(ezdsVar4.h, ezdsVar4.i)).trim()).replaceAll(" ");
                    ekgcVar2.b(strReplaceAll.toLowerCase(), ezdsVar4);
                    if (ezdsVar4.c == 9) {
                        ezhg ezhgVar = (ezhg) ezdsVar4.d;
                        ekib ekibVar = ejngVar.c;
                        if (ekibVar.s(ezhgVar.c)) {
                            ekqg ekqgVarListIterator = ekibVar.c(ezhgVar.c).listIterator();
                            while (ekqgVarListIterator.hasNext()) {
                                ekgcVar.b((String) ekqgVarListIterator.next(), strReplaceAll);
                            }
                        }
                    }
                    if (ezdsVar4.c == 13) {
                        ekib ekibVar2 = ejngVar.c;
                        if (ekibVar2.s(ezdsVar4.f)) {
                            ekqg ekqgVarListIterator2 = ekibVar2.c(ezdsVar4.f).listIterator();
                            while (ekqgVarListIterator2.hasNext()) {
                                ekgcVar.b((String) ekqgVarListIterator2.next(), strReplaceAll);
                            }
                        }
                    }
                    if (ezdsVar4.c == 6) {
                        ekgcVar.b("CONTACT", strReplaceAll);
                    }
                    if (ezdsVar4.c == 7) {
                        ekgcVar.b("ADDRESS", strReplaceAll);
                    }
                    if (ezdsVar4.c == 11) {
                        ekgcVar.b("MONEY", strReplaceAll);
                    }
                    if (ezdsVar4.c == 14) {
                        int i5 = ((ezcl) ezdsVar4.d).b;
                        int i6 = i5 & 2;
                        boolean z = ((i5 & 1) == 0 && i6 == 0 && (i5 & 4) == 0) ? false : true;
                        boolean z2 = ((i6 == 0 || (i5 & 4) == 0) && (i5 & 64) == 0 && (i5 & 128) == 0) ? false : true;
                        int i7 = i5 & 8;
                        boolean z3 = i7 != 0 && ((i5 & 32) == 0 || (i5 & 16) != 0);
                        ((z2 && z3) ? Optional.of("DATE_TIME") : (!z2 || (i7 != 0 || (i5 & 16) != 0 || (i5 & 32) != 0)) ? (!z3 || z) ? Optional.empty() : Optional.of("TIME") : Optional.of("DATE")).ifPresent(new Consumer() { // from class: ejnf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                Pattern pattern = ejng.a;
                                ekgcVar.b((String) obj, strReplaceAll);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    if (ezdsVar4.c == 15) {
                        ekgcVar.b("TIMELIKE", strReplaceAll);
                    }
                    i = 30;
                }
                ekgd ekgdVarA = ekgcVar.a();
                ekgd ekgdVarA2 = ekgcVar2.a();
                ejnn ejnnVar = this.c;
                exwq exwqVar = ejnnVar.c;
                if (exwqVar == null) {
                    exwqVar = exwq.a;
                }
                UserValidators userValidators = new UserValidators(exwqVar);
                HashSet hashSet = new HashSet();
                exwq exwqVar2 = ejnnVar.c;
                if (exwqVar2 == null) {
                    exwqVar2 = exwq.a;
                }
                exwu exwuVar = exwqVar2.b;
                if (exwuVar == null) {
                    exwuVar = exwu.a;
                }
                Iterator<E> it3 = exwuVar.b.iterator();
                while (it3.hasNext()) {
                    hashSet.add(((exws) it3.next()).b);
                }
                ekqg ekqgVarListIterator3 = ejngVar.b.listIterator();
                while (ekqgVarListIterator3.hasNext()) {
                    String str4 = (String) ekqgVarListIterator3.next();
                    ekgb ekgbVarA = ekgdVarA.a(str4);
                    if (ekgbVarA == null) {
                        ekgbVarA = ekoe.a;
                    }
                    if (!ekgbVarA.isEmpty() || !hashSet.contains(str4)) {
                        userValidators.a(str4, (String[]) ekgbVarA.toArray(new String[0]));
                    }
                }
                try {
                    exxbVar = (exxb) evsn.parseFrom(exxb.a, Tagger.nativeTagAndGetNBest(this.d.b, this.e.a, userValidators.a, ezdvVar5.b == 30 ? (String) ezdvVar5.c : "", 1));
                } catch (IOException unused3) {
                    Tagger.a.logp(Level.SEVERE, "com.google.speech.grammar.pumpkin.Tagger", "tag", "Couldn't parse PumpkinTaggerResults proto from JNI");
                    exxbVar = null;
                }
                ekfw ekfwVar3 = new ekfw();
                Iterator it4 = exxbVar.b.iterator();
                while (it4.hasNext()) {
                    exwz exwzVar = (exwz) it4.next();
                    ejmn ejmnVarF = ejmo.f();
                    ejmnVarF.c(exwzVar.b);
                    ejmnVarF.d(exwzVar.d);
                    ekfw ekfwVar4 = new ekfw();
                    for (exwx exwxVar : exwzVar.c) {
                        String str5 = exwxVar.c;
                        ejml ejmlVarH = ejmm.h();
                        ejmlVarH.g(exwxVar.b);
                        ejmlVarH.f(str5);
                        ekgb ekgbVarA2 = ekgdVarA2.a(str5.toLowerCase());
                        int size = ekgbVarA2.size();
                        String str6 = "";
                        int i8 = 0;
                        while (i8 < size) {
                            ezds ezdsVar5 = (ezds) ekgbVarA2.get(i8);
                            ejmh ejmhVar = (ejmh) ejmlVarH;
                            if (ejmhVar.c != null) {
                                it = it4;
                            } else if (ejmhVar.d == null) {
                                ejmhVar.c = new ekfw();
                                it = it4;
                            } else {
                                ejmhVar.c = new ekfw();
                                it = it4;
                                ejmhVar.c.j(ejmhVar.d);
                                ejmhVar.d = null;
                            }
                            ejmhVar.c.h(ezdsVar5);
                            if (str6.isEmpty() && ezdsVar5.c == 9) {
                                String str7 = ((ezhg) ezdsVar5.d).d;
                                ejmlVarH.d(str7);
                                str6 = str7;
                            }
                            if (ezdsVar5.c == 6) {
                                ejmlVarH.h((ezbq) ezdsVar5.d);
                            }
                            if (ezdsVar5.c == 11) {
                                ezor ezorVar2 = ((ezec) ezdsVar5.d).c;
                                if (ezorVar2 == null) {
                                    ezorVar2 = ezor.a;
                                }
                                ejmlVarH.c(ezorVar2);
                            }
                            i8++;
                            it4 = it;
                        }
                        ekfwVar4.h(ejmlVarH.a());
                        c = 11;
                        it4 = it4;
                    }
                    ejmnVarF.b(ekfwVar4.g());
                    ejmnVarF.e(ezal.PUMPKIN_GRAMMAR);
                    ekfwVar3.h(ejmnVarF.a());
                    it4 = it4;
                }
                if (this.g) {
                    userValidators.b();
                }
                return ekfwVar3.g();
            }
        }
        int i9 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.ejmp
    public final /* synthetic */ void b() {
    }
}
