package cn.duckflew.ConsumersAndProducers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer implements Runnable
{
    private Box box;
    @Override
    public void run()
    {
        while (true)
        {
            box.get();
        }
    }
}
