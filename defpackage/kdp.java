package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdp {
    public kew a = new kew(jur.a, jyo.a, (jyo) null);
    public kdq b;

    public kdp() {
        kew kewVar = this.a;
        this.b = new kdq(kewVar.b, kewVar.c);
    }

    public final kew a(List list) {
        kdm kdmVar;
        final kdm kdmVar2 = null;
        try {
            int size = list.size();
            int i = 0;
            kdm kdmVar3 = null;
            while (i < size) {
                try {
                    kdmVar = (kdm) list.get(i);
                } catch (Exception e) {
                    e = e;
                    kdmVar2 = kdmVar3;
                }
                try {
                    kdmVar.a(this.b);
                    i++;
                    kdmVar3 = kdmVar;
                } catch (Exception e2) {
                    e = e2;
                    kdmVar2 = kdmVar;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while applying EditCommand batch to buffer (length=" + this.b.c() + ", composition=" + this.b.e() + ", selection=" + ((Object) jyo.f(this.b.d())) + "):");
                    sb.append('\n');
                    fcva.aI(list, sb, new fdap() { // from class: kdo
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            String strConcat;
                            kdm kdmVar4 = (kdm) obj;
                            if (kdmVar4 instanceof kde) {
                                StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                                kde kdeVar = (kde) kdmVar4;
                                sb2.append(kdeVar.b().length());
                                sb2.append(", newCursorPosition=");
                                sb2.append(kdeVar.a);
                                sb2.append(')');
                                strConcat = sb2.toString();
                            } else if (kdmVar4 instanceof kes) {
                                StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                                kes kesVar = (kes) kdmVar4;
                                sb3.append(kesVar.b().length());
                                sb3.append(", newCursorPosition=");
                                sb3.append(kesVar.a);
                                sb3.append(')');
                                strConcat = sb3.toString();
                            } else if (kdmVar4 instanceof ker) {
                                strConcat = ((ker) kdmVar4).toString();
                            } else if (kdmVar4 instanceof kdk) {
                                strConcat = ((kdk) kdmVar4).toString();
                            } else if (kdmVar4 instanceof kdl) {
                                strConcat = ((kdl) kdmVar4).toString();
                            } else if (kdmVar4 instanceof ket) {
                                strConcat = ((ket) kdmVar4).toString();
                            } else if (kdmVar4 instanceof kds) {
                                strConcat = "FinishComposingTextCommand()";
                            } else if (kdmVar4 instanceof kdd) {
                                strConcat = "BackspaceCommand()";
                            } else {
                                if (kdmVar4 instanceof kee) {
                                    throw null;
                                }
                                if (kdmVar4 instanceof kdj) {
                                    strConcat = "DeleteAllCommand()";
                                } else {
                                    Class<?> cls = kdmVar4.getClass();
                                    int i2 = fdcj.a;
                                    String strC = new fdbi(cls).c();
                                    if (strC == null) {
                                        strC = "{anonymous EditCommand}";
                                    }
                                    strConcat = "Unknown EditCommand: ".concat(strC);
                                }
                            }
                            return (kdmVar2 == kdmVar4 ? " > " : "   ").concat(strConcat);
                        }
                    }, 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            juo juoVar = new juo(this.b.toString());
            long jD = this.b.d();
            jyo jyoVar = true != jyo.j(this.a.c) ? new jyo(jD) : null;
            kew kewVar = new kew(juoVar, jyoVar != null ? jyoVar.b : jyp.a(jyo.c(jD), jyo.d(jD)), this.b.e());
            this.a = kewVar;
            return kewVar;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
