package cn.duckflew.ConsumersAndProducers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producer implements Runnable
{
    private Box box;
    @Override
    public void run()
    {
        for (int i = 1; i <= 35; i++)
        {
            box.put(i);
        }
    }
}
